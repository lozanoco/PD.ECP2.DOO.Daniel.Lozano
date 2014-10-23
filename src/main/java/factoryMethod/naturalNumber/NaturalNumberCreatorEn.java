package factoryMethod.naturalNumber;

public class NaturalNumberCreatorEn extends NaturalNumberCreator{
	
	@Override
	public NaturalNumber createNaturalNumber(int numero) {
		return new NaturalNumberEn(numero);
	}

}
