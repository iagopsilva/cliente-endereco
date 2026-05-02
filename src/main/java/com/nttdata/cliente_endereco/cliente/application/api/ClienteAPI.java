package com.nttdata.cliente_endereco.cliente.application.api;

import com.nttdata.cliente_endereco.cliente.application.api.request.ClienteRequest;
import com.nttdata.cliente_endereco.cliente.application.api.response.ClienteResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public interface ClienteAPI {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ClienteResponse cadastraCliente(@RequestBody @Valid ClienteRequest clienteRequest);
}
