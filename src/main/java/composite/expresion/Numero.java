package composite.expresion;

public class Numero extends Expresion {
	
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}
	@Override
	public int operar() {
		return numero;
	}

}
