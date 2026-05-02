package com.nttdata.cliente_endereco.cliente.application.repository;

import com.nttdata.cliente_endereco.cliente.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
