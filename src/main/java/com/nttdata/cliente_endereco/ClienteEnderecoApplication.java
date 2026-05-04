package com.nttdata.cliente_endereco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.nttdata.cliente_endereco.endereco.infra")
@RestController
@RequestMapping("/")
public class ClienteEnderecoApplication {

    @GetMapping
    public String getHomeTeste() {
        return "Nttdata";
    }

	public static void main(String[] args) {
		SpringApplication.run(ClienteEnderecoApplication.class, args);
	}

}
