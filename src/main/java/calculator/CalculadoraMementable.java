package calculator;


public class CalculadoraMementable extends Calculadora {
    private int total;

	public CalculadoraMementable(){
		super();
	}	
	
	@Override
	public MementoCalculadora createMemento() {
		return new MementoCalculadora(this.getTotal());
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		this.setTotal(memento.getMemento());
		
	}
}
