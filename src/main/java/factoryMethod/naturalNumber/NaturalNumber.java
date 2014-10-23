package factoryMethod.naturalNumber;

public abstract class NaturalNumber {
	
	private static final int LIMITE = 6;
	private int value;
	
	public NaturalNumber(int value) {
		this.value =value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getValorTexto(){
		if (this.value < LIMITE) {
            return obtenerValorTexto(this.value);
        } else {
            return "???";
        }
	}	
	public abstract String obtenerValorTexto(int value);
}
