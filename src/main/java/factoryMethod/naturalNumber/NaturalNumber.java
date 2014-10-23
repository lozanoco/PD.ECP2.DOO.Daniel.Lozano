package factoryMethod.naturalNumber;

public abstract class NaturalNumber {
	
	private static final int LIMITE = 6;
	private int value;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
