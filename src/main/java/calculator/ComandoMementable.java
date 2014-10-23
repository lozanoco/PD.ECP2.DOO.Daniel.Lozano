package calculator;

public abstract class ComandoMementable extends ComandoAbs{
	
	private CalculadoraMementable calcMementable;

	private GestorMementos<MementoCalculadora> gestorMementos;
	
	public ComandoMementable(CalculadoraMementable calculadora, GestorMementos<MementoCalculadora> gestorMementos) {
		super(calculadora);
		this.calcMementable = calculadora;
		this.gestorMementos = gestorMementos;
	}
	
	public CalculadoraMementable getCalculadoraMementable(){
		return calcMementable;
	}
	
	public GestorMementos<MementoCalculadora> getGestorMementos(){
		return this.gestorMementos;
	}
}
