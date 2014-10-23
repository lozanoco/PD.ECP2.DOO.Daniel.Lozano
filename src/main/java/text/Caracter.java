package text;

public class Caracter extends Componente {

	private char caracter;
	
	public Caracter(char caracter) {
		this.setCaracter(caracter);
	}
	
	public char getCaracter() {
		return caracter;
	}

	private void setCaracter(char caracter) {
		this.caracter=caracter;
		
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String caracter = String.valueOf(this.caracter);
		if(mayusculas){
			caracter = caracter.toUpperCase();
		}
		return caracter;
	}
	
	@Override
	 public  void add(Componente componente){
		if(componente.isComposite()){
			 throw new UnsupportedOperationException("No se pueden añadir compuestos a un caracter");
		}		
	}

	@Override
	public boolean isComposite() {
		return false;
	}	
}
