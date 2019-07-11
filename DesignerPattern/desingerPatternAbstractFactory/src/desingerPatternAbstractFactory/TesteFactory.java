package desingerPatternAbstractFactory;

public class TesteFactory {
	
	
	public static Carro montaCarro(String tipo) {
		CarroFactory carro = null;
		switch (tipo) {
		case "Luxo":
			carro= new CarroLuxoFactory();
			break;
	    case "Popular":
	    	carro= new CarroPopularFactory();
			break;
		}
		
		Carro car = new Carro();
		car.setRoda(carro.montarRoda());
		car.setSom(carro.montarSom());		
	return	carro;
	}
	
	public static void main(String args[]) {
		Carro c1 = montaCarro("Luxo");
		Carro c2 = montaCarro("Popular");
		System.out.print(c1.getRoda()+" "+c1.getSom());
		System.out.print(c2.getRoda()+" "+c2.getSom());
		
	}
	

}
