package com.nttdata.cliente_endereco.endereco.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

public class Endereco {
    @Id
    @UuidGenerator
    private UUID id;

    @Column(length = 150)
    @Size(max = 150)
    private String logradouro;

    @Column(length = 20)
    @Size(max = 20)
    private String numero;

    @Column(length = 100)
    @Size(max = 100)
    private String complemento;

    @Column(length = 100)
    @Size(max = 100)
    private String bairro;

    @Column(length = 100)
    @Size(max = 100)
    private String cidade;

    @Column(length = 50)
    @Size(max = 50)
    private String estado;

    @Column(length = 20)
    @Size(max = 20)
    private String cep;
}
