package desginerPatternSingleton.main;

import desginerPatternSingleton.model.aviaoSingletonEgerInstance;

public class aviaoSingletonEgerInstanceTest {
	
	public static void main(String args[]) {
		 agendarAssento("A1");
		 agendarAssento("A1");
		}
	
	
	private static void agendarAssento(String assento) {
		aviaoSingletonEgerInstance aviao = aviaoSingletonEgerInstance.getInstace();
		System.out.println(aviao.bookingAssento(assento)+" "+assento);
		
	}

}
