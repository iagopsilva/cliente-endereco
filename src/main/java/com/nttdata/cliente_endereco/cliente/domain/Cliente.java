package com.nttdata.cliente_endereco.cliente.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(length = 150, nullable = false)
    @NotNull
    @Size(max = 150)
    private String nome;

    @Column(length = 20, nullable = false, unique = true)
    @NotNull
    @Size(max = 20)
    private String cpfCnpj;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "cliente_emails", joinColumns = @JoinColumn(name = "cliente_id"))
    @Column(name = "emails", length = 255, nullable = false)
    private List<@NotNull @Size(max = 255) String> emails;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "cliente_telefones", joinColumns = @JoinColumn(name = "cliente_id"))
    @Column(name = "telefones", length = 30, nullable = false)
    private List<@NotNull @Size(max = 30) String> telefones;
}
