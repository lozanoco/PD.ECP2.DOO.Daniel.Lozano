package factoryMethod.naturalNumber;

public class NaturalNumberCreatorFr extends NaturalNumberCreator{
	
	@Override
	public NaturalNumber createNaturalNumber(int numero) {
		return new NaturalNumberFr(numero);
	}

}
