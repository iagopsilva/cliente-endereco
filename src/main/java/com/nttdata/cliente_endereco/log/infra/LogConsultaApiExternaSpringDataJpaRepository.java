package com.nttdata.cliente_endereco.log.infra;

import com.nttdata.cliente_endereco.log.domain.LogConsultaApiExterna;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LogConsultaApiExternaSpringDataJpaRepository extends JpaRepository<LogConsultaApiExterna, UUID> {
}
