package calculator;

import upm.jbb.IO;

public class ComandoRestar implements Comando {
    
    private static String RESTAR="restar";
    private Calculadora calc;

    public ComandoRestar(Calculadora calc) {
        // TODO Auto-generated constructor stub
        this.calc=calc;
    }

    public void execute() {
        // TODO Auto-generated method stub
        calc.restar(IO.in.readInt("Introducca la cantidad a restar: "));
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return RESTAR;
    }

}
