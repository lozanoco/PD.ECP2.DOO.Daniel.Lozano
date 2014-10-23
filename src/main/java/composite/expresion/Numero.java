package composite.expresion;

public class Numero extends Expresion {
	
	private int numero;

	public Numero(int numero) {
		this.setNumero(numero);
	}
	@Override
	public int operar() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


}
