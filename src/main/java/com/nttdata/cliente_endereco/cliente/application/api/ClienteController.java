package com.nttdata.cliente_endereco.cliente.application.api;

import com.nttdata.cliente_endereco.cliente.application.api.request.ClienteRequest;
import com.nttdata.cliente_endereco.cliente.application.api.response.ClienteResponse;
import com.nttdata.cliente_endereco.cliente.application.service.ClienteApplicationService;
import com.nttdata.cliente_endereco.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

    private final ClienteService clienteService;

    @Override
    public ClienteResponse cadastraCliente(ClienteRequest clienteRequest){
        log.info("[start] ClienteController - cadastraCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.debug("[finish] ClienteController - cadastraCliente");
        return clienteCriado;
    }

}
