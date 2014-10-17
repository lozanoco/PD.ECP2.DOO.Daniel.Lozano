package calculator;

import upm.jbb.IO;

public class ComandoIniciar extends ComandoAbs {
    
    private static String C="c";

    public ComandoIniciar(Calculadora calc) {
        // TODO Auto-generated constructor stub
        super(calc);
    }

    public void execute() {
        // TODO Auto-generated method stub
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return C;
    }

}
