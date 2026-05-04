package com.nttdata.cliente_endereco.endereco.infra;

import com.nttdata.cliente_endereco.endereco.application.api.request.EnderecoRequest;
import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;
import com.nttdata.cliente_endereco.endereco.application.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

@Repository
@RequiredArgsConstructor
@Slf4j
public class EnderecoRepositoryFeign implements EnderecoRepository {

    private final EnderecoFeignClient enderecoFeignClient;

    @Override
    public EnderecoResponse buscaEnderecoPorCep(String cep, EnderecoRequest enderecoRequest) {
        log.info("[start] EnderecoRepositoryFeign - buscaEnderecoPorCep");

        WiremockCepResponse cepApi = enderecoFeignClient.buscarPorCep(cep);

        EnderecoResponse response = EnderecoResponse.builder()
                .cep(cepApi.getCep())
                .logradouro(cepApi.getLogradouro())
                .bairro(cepApi.getBairro())
                .numero(enderecoRequest.getNumero())
                .complemento(StringUtils.hasText(enderecoRequest.getComplemento())
                        ? enderecoRequest.getComplemento()
                        : cepApi.getComplemento())
                .cidade(cepApi.getCidade())
                .estado(cepApi.getEstado())
                .build();
        log.debug("[finish] EnderecoRepositoryFeign - buscaEnderecoPorCep");
        return response;
    }
}
