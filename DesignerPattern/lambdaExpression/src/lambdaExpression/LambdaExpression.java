package lambdaExpression;

import java.util.List;

public final class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fatura> faturas = new FaturaDao().buscarFatura();
		EnviadorEmail e= new EnviadorEmail();
		
//		for(Fatura fatura : faturas) {			
//		e.enviar(fatura.getEmail(), fatura.resumo());
//		}		
		
		faturas.forEach(fatura -> e.enviar(fatura.getEmail(), fatura.resumo()));

	}

}
