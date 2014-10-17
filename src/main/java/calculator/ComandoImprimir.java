package calculator;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoAbs {
    
    private static String IMPRIMIR="imprimir";

    public ComandoImprimir(Calculadora calc) {
        // TODO Auto-generated constructor stub
        super(calc);
    }

    public void execute() {
        // TODO Auto-generated method stub
        IO.out.println(calc.getTotal());
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return IMPRIMIR;
    }

}
