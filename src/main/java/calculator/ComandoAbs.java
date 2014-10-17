package calculator;

public abstract  class ComandoAbs implements Comando {
    
    protected Calculadora calc;
    
    protected ComandoAbs(Calculadora calc) {
        this.calc=calc;
    }
    public abstract void execute();

    public abstract String name();
}
