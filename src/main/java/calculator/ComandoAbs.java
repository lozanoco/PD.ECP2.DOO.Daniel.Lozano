package calculator;

public abstract  class ComandoAbs implements Comando {
    
    protected Calculadora calc;
    
    protected ComandoAbs(Calculadora calc) {
        // TODO Auto-generated constructor stub
        this.calc=calc;
    }
}
