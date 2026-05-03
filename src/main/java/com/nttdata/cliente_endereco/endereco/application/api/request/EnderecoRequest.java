package com.nttdata.cliente_endereco.endereco.application.api.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EnderecoRequest {
    @NotBlank(message = "{validacao.numero.obrigatorio}")
    @Size(max = 10)
    private String numero;

    @Size(max = 100)
    private String complemento;
}
