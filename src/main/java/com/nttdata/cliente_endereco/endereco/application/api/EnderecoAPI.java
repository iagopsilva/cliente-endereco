package com.nttdata.cliente_endereco.endereco.application.api;

import com.nttdata.cliente_endereco.endereco.application.api.request.EnderecoRequest;
import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public interface EnderecoAPI {
    @PostMapping(value = "/{cep}")
    @ResponseStatus(HttpStatus.CREATED)
    EnderecoResponse cadastraEndereco(
            @PathVariable String cep, @RequestBody @Valid EnderecoRequest enderecoRequest);

}
