package com.nttdata.cliente_endereco.endereco.infra;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "viacep-api", url = "${viacep.api.base-url}")
public interface EnderecoFeignClient {

}
