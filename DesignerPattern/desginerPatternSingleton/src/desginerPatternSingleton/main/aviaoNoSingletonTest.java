package desginerPatternSingleton.main;

import desginerPatternSingleton.model.aviaoNoSingletonSimples;

public class aviaoNoSingletonTest {
	
	public static void main(String args[]) {
	 agendarAssento("A1");
	 agendarAssento("A1");
	}
	
	
	/** 
	 *  Saida permitiu reservar o assento duas vezes
	 *    true A1
     *    true A1
	 */	
	private static void agendarAssento(String assento) {
		aviaoNoSingletonSimples aviao = new aviaoNoSingletonSimples();
		System.out.println(aviao.bookingAssento(assento)+" "+assento);
		
	}

}
