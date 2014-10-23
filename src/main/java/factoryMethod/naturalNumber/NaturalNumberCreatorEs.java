package factoryMethod.naturalNumber;

public class NaturalNumberCreatorEs extends NaturalNumberCreator{
	
	@Override
	public NaturalNumber createNaturalNumber(int numero) {
		return new NaturalNumberEs(numero);
	}

}
