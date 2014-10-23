package calculator;


public class CalculadoraMementable extends Calculadora {
    private int total;

	public CalculadoraMementable(){
		super();
	}	
	

	public Memento createMemento() {
		return new Memento(this.getTotal());
	}


	public void restoreMemento(Memento memento) {
		this.setTotal(memento.getMemento());
		
	}
}
