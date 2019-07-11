package desginerPatternSingleton.model;

import java.util.HashSet;
import java.util.Set;

public class aviaoSingletonEgerInstance {
	
	/**Start Eager Instance permit only one Instance Of Object*/	
	private static final aviaoSingletonEgerInstance INSTANCE = new aviaoSingletonEgerInstance();
	/**End Eager Instance*/
	private Set<String> assentosDisponiveis;
	
	public static aviaoSingletonEgerInstance getInstace() {
		return INSTANCE;
	}
		
	private aviaoSingletonEgerInstance() {
		this.assentosDisponiveis=new HashSet<String>();
		this.assentosDisponiveis.add("A1");
		this.assentosDisponiveis.add("A2");
		this.assentosDisponiveis.add("A3");
	}
	
	public boolean bookingAssento(String assento) {
		return this.assentosDisponiveis.remove(assento);
	}

}
