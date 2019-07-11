package desginerPatternSingleton.model;

import java.util.HashSet;
import java.util.Set;

public class aviaoSingletonLazyInstace {
	
	/**Start Lazy Instance permit only one Instance Of Object*/	
	private static  aviaoSingletonLazyInstace INSTANCE; 
	/**End Lazy Instance*/
	
	private Set<String> assentosDisponiveis;
	
	/**Is possible insert synchronized, but the thread will soffer overload*/
	public static aviaoSingletonLazyInstace getInstace() {
		if(INSTANCE==null) {
			INSTANCE = 	new aviaoSingletonLazyInstace();
		}
		return INSTANCE;		
	}
		
	private aviaoSingletonLazyInstace() {
		this.assentosDisponiveis=new HashSet<String>();
		this.assentosDisponiveis.add("A1");
		this.assentosDisponiveis.add("A2");
		this.assentosDisponiveis.add("A3");
	}
	
	public boolean bookingAssento(String assento) {
		return this.assentosDisponiveis.remove(assento);
	}

}
