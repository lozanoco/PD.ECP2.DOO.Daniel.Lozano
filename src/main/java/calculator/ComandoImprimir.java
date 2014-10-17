package calculator;

public class ComandoImprimir extends ComandoAbs {
    
    private static String IMPRIMIR="imprimir";

    public ComandoImprimir(Calculadora calc) {
        // TODO Auto-generated constructor stub
        super(calc);
    }

    public void execute() {
        // TODO Auto-generated method stub
        //******** vER COMO IMPLEMENTAR LA SALIDA
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return IMPRIMIR;
    }

}
