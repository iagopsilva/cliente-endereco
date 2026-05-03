package com.nttdata.cliente_endereco.endereco.application.service;

import com.nttdata.cliente_endereco.endereco.application.api.request.EnderecoRequest;
import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Log4j2
@RequiredArgsConstructor
public class EnderecoApplicationService implements EnderecoService{

    @Override
    @Transactional
    public EnderecoResponse criaEndereco(EnderecoRequest enderecoRequest) {
        log.info("[start] EnderecoApplicationService - criaEndereco");
        log.debug("[finish] EnderecoApplicationService - criaEndereco");
        return null;
    }
}
