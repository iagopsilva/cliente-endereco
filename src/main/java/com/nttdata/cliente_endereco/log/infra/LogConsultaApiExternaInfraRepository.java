package com.nttdata.cliente_endereco.log.infra;

import com.nttdata.cliente_endereco.log.application.repository.LogConsultaApiExternaRepository;
import com.nttdata.cliente_endereco.log.domain.LogConsultaApiExterna;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
@Log4j2
public class LogConsultaApiExternaInfraRepository implements LogConsultaApiExternaRepository {

    private final LogConsultaApiExternaSpringDataJpaRepository logConsultaApiExternaSpringDataJpaRepository;

    @Override
    @Transactional
    public void salvar(String cepConsultado, String dadosRespostaJson) {
        log.info("[start] LogConsultaApiExternaInfraRepository - salvar");
        logConsultaApiExternaSpringDataJpaRepository.saveAndFlush(
                new LogConsultaApiExterna(cepConsultado, dadosRespostaJson));
        log.debug("[finish] LogConsultaApiExternaInfraRepository - salvar");
    }
}
