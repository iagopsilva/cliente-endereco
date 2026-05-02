package com.nttdata.cliente_endereco.cliente.application.service;

import com.nttdata.cliente_endereco.cliente.application.api.request.ClienteRequest;
import com.nttdata.cliente_endereco.cliente.application.api.response.ClienteResponse;
import com.nttdata.cliente_endereco.cliente.application.repository.ClienteRepository;
import com.nttdata.cliente_endereco.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    @Transactional
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[start] ClienteApplicationService - criaCliente");
        Cliente clienteCriado = clienteRepository.salva(new Cliente(clienteRequest));
        log.debug("[finish] ClienteApplicationService - criaCliente");
        return new ClienteResponse(clienteCriado);
    }
}
