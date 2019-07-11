package com.org.ajbnetsys.ajbnetwebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class AjbnetwebapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjbnetwebapiApplication.class, args);
	}
	
	
	@RequestMapping("/")
	public String home() {
		int a=10;
		int b=2;
		int result=a*b;
		return String.format("O resultado é %s", result);
	}
	
	
	@RequestMapping("/alunos")
	public String getAlunos() {
		
		return "{\"alunos\":["
				+ "{\"Sergiao\":\"1-turma\"},"
				+ "{\"Alice\":\"2-turma\"},"
				+ "{\"Claudia\":\"3-turma\"},"
				+ "]}";
	}

}
