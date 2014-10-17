package calculator;

import upm.jbb.IO;

public class ComandoRestar extends ComandoAbs {
    
    private static String RESTAR="restar";

    public ComandoRestar(Calculadora calc) {
        // TODO Auto-generated constructor stub
        super(calc);
    }

    public void execute() {
        // TODO Auto-generated method stub
        super.calc.restar(IO.in.readInt("Introduzca la cantidad a restar: "));
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return RESTAR;
    }

}
