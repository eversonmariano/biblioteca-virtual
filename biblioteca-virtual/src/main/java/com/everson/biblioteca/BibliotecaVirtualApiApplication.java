package com.everson.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class BibliotecaVirtualApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaVirtualApiApplication.class, args);
	}

}
