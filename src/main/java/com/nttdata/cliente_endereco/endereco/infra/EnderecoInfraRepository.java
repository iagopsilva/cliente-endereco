package com.nttdata.cliente_endereco.endereco.infra;

import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;
import com.nttdata.cliente_endereco.endereco.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
@Log4j2
public class EnderecoInfraRepository {

    private final EnderecoSpringDataJpaRepository enderecoSpringDataJpaRepository;

    @Transactional
    public EnderecoResponse salva(EnderecoResponse enderecoResponse) {
        log.info("[start] EnderecoInfraRepository - salva");
        Endereco entidade = new Endereco(enderecoResponse);
        Endereco salvo = enderecoSpringDataJpaRepository.saveAndFlush(entidade);
        EnderecoResponse response = EnderecoResponse.builder()
                .idEndereco(salvo.getId())
                .cep(salvo.getCep())
                .logradouro(salvo.getLogradouro())
                .numero(salvo.getNumero())
                .complemento(salvo.getComplemento())
                .bairro(salvo.getBairro())
                .cidade(salvo.getCidade())
                .estado(salvo.getEstado())
                .build();
        log.debug("[finish] EnderecoInfraRepository - salva");
        return response;
    }
}
