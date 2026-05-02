package com.nttdata.cliente_endereco.cliente.application.api.request;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {
    @NotBlank(message = "{validacao.nome.obrigatorio}")
    @Size(max = 150, message = "Nome deve ter no máximo 150 caracteres")
    private String nome;

    @Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$", message = "{validacao.cpf.formato}")
    @NotBlank(message = "{validacao.documento.obrigatorio}")
    private String cpfCnpj;

    @NotNull(message = "{validacao.emails.obrigatorio}")
    private List<@NotBlank @Size(max = 150) String> emails;

    @NotNull(message = "{validacao.telefones.obrigatorio}")
    private List<@NotBlank @Size(max = 20) String> telefones;
}
