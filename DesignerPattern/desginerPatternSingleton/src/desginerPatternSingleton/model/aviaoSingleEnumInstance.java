package desginerPatternSingleton.model;

import java.util.HashSet;
import java.util.Set;

public enum aviaoSingleEnumInstance {
  INSTANCE;
	private Set<String> assentosDisponiveis;
	
	aviaoSingleEnumInstance(){
		this.assentosDisponiveis=new HashSet<String>();
		this.assentosDisponiveis.add("A1");
		this.assentosDisponiveis.add("A2");
		this.assentosDisponiveis.add("A3");
	}
	
	public boolean bookingAssento(String assento) {
		return this.assentosDisponiveis.remove(assento);
	}
	

	public static void agendarAssento(String assento) {
		aviaoSingleEnumInstance aviao = aviaoSingleEnumInstance.INSTANCE;
		System.out.println(aviao.bookingAssento(assento)+" "+assento);
		
	}
}
