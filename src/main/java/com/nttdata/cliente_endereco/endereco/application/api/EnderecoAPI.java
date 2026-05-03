package com.nttdata.cliente_endereco.endereco.application.api;

import com.nttdata.cliente_endereco.endereco.application.api.request.EnderecoRequest;
import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public interface EnderecoAPI {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    EnderecoResponse cadastraEndereco(@RequestBody @Valid EnderecoRequest enderecoRequest);

}
