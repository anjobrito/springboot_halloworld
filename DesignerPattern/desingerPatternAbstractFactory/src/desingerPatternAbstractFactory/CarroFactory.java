package desingerPatternAbstractFactory;

public abstract class CarroFactory extends Carro{
	
	public abstract Roda montarRoda();
	public abstract Som montarSom();

}
