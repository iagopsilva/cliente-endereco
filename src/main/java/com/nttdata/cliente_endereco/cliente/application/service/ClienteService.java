package com.nttdata.cliente_endereco.cliente.application.service;

import com.nttdata.cliente_endereco.cliente.application.api.request.ClienteRequest;
import com.nttdata.cliente_endereco.cliente.application.api.response.ClienteResponse;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);


}
