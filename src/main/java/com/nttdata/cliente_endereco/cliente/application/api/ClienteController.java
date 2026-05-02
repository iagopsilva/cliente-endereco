package com.nttdata.cliente_endereco.cliente.application.api;

import com.nttdata.cliente_endereco.cliente.application.api.request.ClienteRequest;
import com.nttdata.cliente_endereco.cliente.application.api.response.ClienteResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

    @Override
    public ClienteResponse cadastraCliente(ClienteRequest clienteRequest){
        log.info("[start] ClienteController - cadastraCliente");
        log.debug("[finish] ClienteController - cadastraCliente");
        return null;
    }

}
