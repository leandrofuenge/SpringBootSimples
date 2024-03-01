package com.example.myapp.SpringApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	private static final Logger logger = LoggerFactory.getLogger(CrudApplication.class);

	public static void main(String[] args) {
		startApplication(args);
	}

	private static void startApplication(String[] args) {
		try {
			SpringApplication.run(CrudApplication.class, args);
		} catch (Exception e) {
			logger.error("Erro ao iniciar a aplicação: " + e.getMessage(), e);
			// Se ocorrer uma falha na inicialização, a aplicação será encerrada
			// Você pode considerar adicionar lógica de retentativa aqui
		}
	}
}
