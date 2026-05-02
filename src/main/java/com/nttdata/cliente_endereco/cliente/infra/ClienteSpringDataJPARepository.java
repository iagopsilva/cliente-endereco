package com.nttdata.cliente_endereco.cliente.infra;

import com.nttdata.cliente_endereco.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {
}
