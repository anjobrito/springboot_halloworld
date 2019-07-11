package desingerPatternAbstractFactory;

public class Carro {
	
	public Roda getRoda() {
		return roda;
	}
	public void setRoda(Roda roda) {
		this.roda = roda;
	}
	public Som getSom() {
		return som;
	}
	public void setSom(Som som) {
		this.som = som;
	}
	private Roda roda;
	private Som som;
	

}
