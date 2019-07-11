package designerPatternsBuild.model;

import java.util.Date;

public class Pessoa {
	
	private int idPessoa;
	private String nome;
	private int idade;
	private Date dataNasc;
	
	
	
	private Pessoa(int idPessoa,String nome,int idade,Date dataNasc) {
		this.idPessoa=idPessoa;
		this.nome=nome;
		this.idade=idade;
		this.dataNasc=dataNasc;
		isNotSetted(this.idPessoa);
		isNotSetted(this.nome);
		isNotSetted(this.idade);
		isNotSetted(this.dataNasc);
		
	}
	
	public static class PessoaBuilder{
		
		private int idPessoa;
		private String nome;
		private int idade;
		private Date dataNasc;
		
		public PessoaBuilder idPessoa(int idPessoa) {
			this.idPessoa=idPessoa;
			return this;
		}	
		
		public PessoaBuilder nome(String nome) {
			this.nome=nome;
			return this;
		}	
		
		
		public PessoaBuilder idade(int idade) {
			this.idade=idade;
			return this;
		}
		
		public PessoaBuilder dataNasc(Date dataNasc) {
			this.dataNasc=dataNasc;
			return this;
		}
		
		public Pessoa build() {
		 return new Pessoa(idPessoa, nome, idade, dataNasc);
		}		
	}
	
	
	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	private static void isNotSetted(Object obj) {	  	
		boolean isValid=false;
		if(obj instanceof Integer) {
			isValid=true;			
		}else
			if(obj instanceof String) {
				isValid=true;	
			}else
				if(obj instanceof Date) {
					isValid=true;
			}
		if(!isValid) {
			throw new IllegalArgumentException("Exists one or more fields was empty");			
		}
			
	}
	

}
