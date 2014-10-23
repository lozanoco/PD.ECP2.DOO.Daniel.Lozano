package calculator;


public class CalculadoraMementable extends Calculadora {
    private int total;

	public CalculadoraMementable(){
		super();
	}	
	
	@Override
	public Memento createMemento() {
		return new Memento(this.getTotal());
	}

	@Override
	public void restoreMemento(Memento memento) {
		this.setTotal(memento.getMemento());
		
	}
}
