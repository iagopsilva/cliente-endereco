package com.nttdata.cliente_endereco.endereco.application.repository;

import com.nttdata.cliente_endereco.endereco.application.api.request.EnderecoRequest;
import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;

public interface EnderecoRepository {
    EnderecoResponse buscaEnderecoPorCep(String cep, EnderecoRequest enderecoRequest);
}
