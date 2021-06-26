package com.desafio.orange.heycar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HeycarApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeycarApplication.class, args);
	}

}
