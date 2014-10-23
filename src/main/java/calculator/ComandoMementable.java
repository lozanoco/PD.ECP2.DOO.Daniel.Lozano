package calculator;

public abstract class ComandoMementable extends ComandoAbs{
	
	private CalculadoraMementable calcMementable;

	private GestorMementos<Memento> gestorMementos;
	
	public ComandoMementable(CalculadoraMementable calculadora, GestorMementos<Memento> gestorMementos) {
		super(calculadora);
		this.calcMementable = calculadora;
		this.gestorMementos = gestorMementos;
	}
	
	public CalculadoraMementable getCalculadoraMementable(){
		return calcMementable;
	}
	
	public GestorMementos<Memento> getGestorMementos(){
		return this.gestorMementos;
	}
}
