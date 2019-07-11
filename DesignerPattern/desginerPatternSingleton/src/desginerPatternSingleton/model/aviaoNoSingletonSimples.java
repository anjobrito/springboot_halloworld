package desginerPatternSingleton.model;

import java.util.HashSet;
import java.util.Set;

public class aviaoNoSingletonSimples {
	private Set<String> assentosDisponiveis;
	
	public aviaoNoSingletonSimples() {
		this.assentosDisponiveis=new HashSet<String>();
		this.assentosDisponiveis.add("A1");
		this.assentosDisponiveis.add("A2");
		this.assentosDisponiveis.add("A3");				
	}
	
	public boolean bookingAssento(String assento) {
		return this.assentosDisponiveis.remove(assento);
	}

}
