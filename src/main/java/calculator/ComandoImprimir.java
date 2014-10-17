package calculator;

public class ComandoImprimir implements Comando {
    
    private static String IMPRIMIR="imprimir";
    private Calculadora calc;

    public ComandoImprimir(Calculadora calc) {
        // TODO Auto-generated constructor stub
        this.calc=calc;
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
