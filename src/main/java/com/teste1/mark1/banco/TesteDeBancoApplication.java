package com.teste1.mark1.banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteDeBancoApplication {

	public static void main(String[] args) {
		
		System.out.println("Inicinado Serviço Teste.Banco.Mark1");
		SpringApplication.run(TesteDeBancoApplication.class, args);
		System.out.println("Deu certo");
	}
	

}
