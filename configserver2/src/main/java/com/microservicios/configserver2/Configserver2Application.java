package com.microservicios.configserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class Configserver2Application {

	public static void main(String[] args) {
		SpringApplication.run(Configserver2Application.class, args);
	}

}
