package com.org.ajbnetsys.ajbnetwebapi.controller.aluno;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAlunos {
	
	
	@RequestMapping("/alunoId")
	public String getAlunoById() {		
		return "{\"aluno\":["
				+ "{\"id\":\"Sergio\"}"				
				+ "]}";
	}
	
	@RequestMapping("/alunos")
	public List<Aluno> getAlunos() {		
		return Arrays.asList(
				new Aluno.AlunoBuilder().id(4).name("Andre Brito").bournDate(new Date()).state("Active").builder(),
				new Aluno.AlunoBuilder().id(3).name("Andre Rosa").bournDate(new Date()).state("Inactive").builder(),
				new Aluno.AlunoBuilder().id(5).name("Luders Almeida").bournDate(new Date()).state("Incompleted").builder(),
				new Aluno.AlunoBuilder().id(6).name("Carlos Arruda").bournDate(new Date()).state("Deprecated").builder()
				);
	}

}
