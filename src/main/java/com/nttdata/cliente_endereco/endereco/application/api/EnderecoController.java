package com.nttdata.cliente_endereco.endereco.application.api;

import com.nttdata.cliente_endereco.cliente.application.api.response.ClienteResponse;
import com.nttdata.cliente_endereco.cliente.application.service.ClienteApplicationService;
import com.nttdata.cliente_endereco.cliente.application.service.ClienteService;
import com.nttdata.cliente_endereco.endereco.application.api.request.EnderecoRequest;
import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;
import com.nttdata.cliente_endereco.endereco.application.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EnderecoController  implements EnderecoAPI{


    private final EnderecoService enderecoService;

    @Override
    public EnderecoResponse cadastraEndereco(EnderecoRequest enderecoRequest) {
        log.info("[start] EnderecoController - cadastraEndereco");
        EnderecoResponse enderecoCriado = enderecoService.criaEndereco(enderecoRequest);
        log.debug("[finish] EnderecoController - cadastraEndereco");
        return null;
    }
}
