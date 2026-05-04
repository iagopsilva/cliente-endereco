package com.nttdata.cliente_endereco.endereco.application.service;

import com.nttdata.cliente_endereco.endereco.application.api.request.EnderecoRequest;
import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;
import com.nttdata.cliente_endereco.endereco.application.repository.EnderecoRepository;
import com.nttdata.cliente_endereco.endereco.domain.Endereco;
import com.nttdata.cliente_endereco.endereco.infra.EnderecoInfraRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class EnderecoApplicationService implements EnderecoService{

    private final EnderecoRepository enderecoRepository;
    private final EnderecoInfraRepository enderecoInfraRepository;

    @Override
    public EnderecoResponse criaEndereco(String cep, EnderecoRequest enderecoRequest) {
        log.info("[start] EnderecoApplicationService - criaEndereco");
        Endereco.validaQuantidadeCaracteres(cep);
        String cepSomenteDigitos = Endereco.cepSomenteNumeros(cep);
        EnderecoResponse enderecoPorCep = enderecoRepository.buscaEnderecoPorCep(cepSomenteDigitos, enderecoRequest);
        EnderecoResponse enderecoPersistido = enderecoInfraRepository.salva(enderecoPorCep);
        log.debug("[finish] EnderecoApplicationService - criaEndereco");
        return enderecoPersistido;
    }
}
