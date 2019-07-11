package lambdaExpression;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fatura {
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(LocalDate dataVenc) {
		this.dataVenc = dataVenc;
	}

	public String email;
	public double valor;
	public LocalDate dataVenc;
	
	public Fatura( String email,double valor,LocalDate dataVenc) {		
		this.email = email;
		this.valor = valor;
		this.dataVenc = dataVenc;		
	}
	
	public String resumo() {
		return String.format("Valor R$ %s Fatura vencida em  %s \n", this.valor,this.dataVenc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
	
	

}
