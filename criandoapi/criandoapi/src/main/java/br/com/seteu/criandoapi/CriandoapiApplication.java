package br.com.seteu.criandoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})//lembrar de remover o exclude
public class CriandoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriandoapiApplication.class, args);
	}

}
