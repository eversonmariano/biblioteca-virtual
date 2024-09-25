package com.everson.biblioteca;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication(scanBasePackages = {"x"} , exclude = JpaRepositoriesAutoConfiguration.class)
@EnableJpaAuditing
@EnableAsync
public class BibliotecaVirtualApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaVirtualApiApplication.class, args);
	}

}
