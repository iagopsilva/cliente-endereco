package com.nttdata.cliente_endereco.log.application.repository;

public interface LogConsultaApiExternaRepository {

    void salvar(String cepConsultado, String dadosRespostaJson);
}
