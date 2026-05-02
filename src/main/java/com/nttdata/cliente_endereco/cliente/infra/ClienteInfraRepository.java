package com.nttdata.cliente_endereco.cliente.infra;

import com.nttdata.cliente_endereco.cliente.application.repository.ClienteRepository;
import com.nttdata.cliente_endereco.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

    private final ClienteSpringDataJPARepository clienteSpringDataJpaRepository;

    @Override
    @Transactional
    public Cliente salva(Cliente cliente) {
        log.info("[start] ClienteInfraRepository - salva");
        Cliente clienteSalvo = clienteSpringDataJpaRepository.saveAndFlush(cliente);
        log.debug("[finish] ClienteInfraRepository - salva");
        return clienteSalvo;
    }
}
