package designerPatternsBuild.main.com;

import java.text.SimpleDateFormat;
import java.util.Date;

import designerPatternsBuild.model.Pessoa;

public class ApplicationStarter {

	public static void main(String[] args) {
      //The implementation of Designer Builder
		Pessoa p = new Pessoa.PessoaBuilder()
				              .idPessoa(1)
				              .nome("Paulo Cesar Ferraz")				              
				              .idade(1)
				              .dataNasc(new Date())
				              .build();
		
		System.out.println(p.getIdPessoa());
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(p.getDataNasc()));
		
	}

}
