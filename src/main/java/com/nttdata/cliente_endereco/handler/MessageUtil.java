package com.nttdata.cliente_endereco.handler;

import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageUtil {
  private final MessageSource messageSource;

  public MessageUtil(MessageSource messageSource) {
    this.messageSource = messageSource;
  }

  public String getMessage(ErrorCode errorCode, Object... args) {
    try {
      return messageSource.getMessage(errorCode.getCode(), args, Locale.getDefault());
    } catch (NoSuchMessageException e) {
      return errorCode.getCode();
    }
  }
}
