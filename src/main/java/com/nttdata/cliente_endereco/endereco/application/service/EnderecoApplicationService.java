package com.nttdata.cliente_endereco.endereco.application.service;

import com.nttdata.cliente_endereco.endereco.application.api.request.EnderecoRequest;
import com.nttdata.cliente_endereco.endereco.application.api.response.EnderecoResponse;
import com.nttdata.cliente_endereco.endereco.application.repository.EnderecoRepository;
import com.nttdata.cliente_endereco.endereco.infra.EnderecoInfraRepository;
import com.nttdata.cliente_endereco.handler.APIException;
import com.nttdata.cliente_endereco.handler.ErrorCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class EnderecoApplicationService implements EnderecoService{

    private final EnderecoRepository enderecoRepository;
    private final EnderecoInfraRepository enderecoInfraRepository;

    @Override
    public EnderecoResponse criaEndereco(String cep, EnderecoRequest enderecoRequest) {
        log.info("[start] EnderecoApplicationService - criaEndereco");
        validaQuantidadeCaracteres(cep);
        String cepSomenteDigitos = cepSomenteDigitos(cep);
        EnderecoResponse enderecoPorCep = enderecoRepository.buscaEnderecoPorCep(cepSomenteDigitos, enderecoRequest);
        EnderecoResponse enderecoPersistido = enderecoInfraRepository.salva(enderecoPorCep);
        log.debug("[finish] EnderecoApplicationService - criaEndereco");
        return enderecoPersistido;
    }

    private void validaQuantidadeCaracteres(String cep) {
        String digitos = cepSomenteDigitos(cep);
        if (digitos.length() != 8) {
            throw new APIException(HttpStatus.BAD_REQUEST, ErrorCode.QUANTIDADE_DE_CARACTER_INVALIDA);
        }
    }

    private static String cepSomenteDigitos(String cep) {
        if (cep == null) {
            return "";
        }
        return cep.replaceAll("\\D", "");
    }
}
