package com.org.ajbnetsys.ajbnetwebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class AjbnetwebapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjbnetwebapiApplication.class, args);
	}	
	
	@RequestMapping("/")
	public String home() {		
		return "Wellcome to my Application";
	}
	
	
	

}
