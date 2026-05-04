package com.nttdata.cliente_endereco.endereco.domain;

import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 150)
    @Size(max = 150)
    private String logradouro;

    @Column(length = 10, nullable = false)
    @Size(max = 10)
    private String numero;

    @Column(length = 100)
    @Size(max = 100)
    private String complemento;

    @Column(length = 100)
    @Size(max = 100)
    private String bairro;

    @Column(length = 100, nullable = false)
    @Size(max = 100)
    private String cidade;

    @Column(length = 50)
    @Size(max = 50)
    private String estado;

    @Column(length = 20, nullable = false)
    @Size(max = 20)
    private String cep;

    public Endereco(EnderecoResponse response) {
        this.cep = response.getCep();
        this.logradouro = response.getLogradouro();
        this.numero = response.getNumero();
        this.complemento = response.getComplemento();
        this.bairro = response.getBairro();
        this.cidade = response.getCidade();
        this.estado = response.getEstado();
    }
}
