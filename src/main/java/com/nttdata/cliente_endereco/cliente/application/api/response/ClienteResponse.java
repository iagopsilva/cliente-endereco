package com.nttdata.cliente_endereco.cliente.application.api.response;

import com.nttdata.cliente_endereco.cliente.domain.Cliente;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class ClienteResponse {
    private UUID id;
    private String nome;
    private String cpfCnpj;
    private List<String> emails;
    private List<String> telefones;

    public ClienteResponse(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.cpfCnpj = cliente.getCpfCnpj();
        this.emails = cliente.getEmails() == null ? List.of() : new ArrayList<>(cliente.getEmails());
        this.telefones = cliente.getTelefones() == null ? List.of() : new ArrayList<>(cliente.getTelefones());
    }
}
