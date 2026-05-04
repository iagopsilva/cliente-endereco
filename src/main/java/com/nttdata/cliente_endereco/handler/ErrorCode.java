package com.nttdata.cliente_endereco.handler;

public enum ErrorCode {
  QUANTIDADE_DE_CARACTER_INVALIDA("quantidade.de.caracter.invalida");

  private final String code;

  ErrorCode(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}
