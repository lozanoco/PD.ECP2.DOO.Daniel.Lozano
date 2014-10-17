package calculator;

import upm.jbb.IO;

public class ComandoIniciar implements Comando {
    
    private static String C="c";
    private Calculadora calc;

    public ComandoIniciar(Calculadora calc) {
        // TODO Auto-generated constructor stub
        this.calc=calc;
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
