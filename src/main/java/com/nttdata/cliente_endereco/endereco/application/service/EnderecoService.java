package com.nttdata.cliente_endereco.endereco.application.service;

import com.nttdata.cliente_endereco.endereco.application.api.request.EnderecoRequest;
import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;

public interface EnderecoService {
    EnderecoResponse criaEndereco(String cep, EnderecoRequest enderecoRequest);
}
