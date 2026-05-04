package com.nttdata.cliente_endereco.endereco.infra;

import com.nttdata.cliente_endereco.endereco.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnderecoSpringDataJpaRepository extends JpaRepository<Endereco, UUID> {
}
