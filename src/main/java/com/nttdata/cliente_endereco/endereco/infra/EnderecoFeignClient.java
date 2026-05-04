package com.nttdata.cliente_endereco.endereco.infra;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "wiremock-enderecos", url = "${cep.api.base-url}")
public interface EnderecoFeignClient {

    @GetMapping("/{cep}")
    WiremockCepResponse buscarPorCep(@PathVariable("cep") String cep);
}
