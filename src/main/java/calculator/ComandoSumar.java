package calculator;

import upm.jbb.IO;

public class ComandoSumar extends ComandoAbs {
    
    private static String SUMAR="sumar";

    public ComandoSumar(Calculadora calc) {
        // TODO Auto-generated constructor stub
        super(calc);
    }

    public void execute() {
        // TODO Auto-generated method stub
        super.calc.sumar(IO.in.readInt("Introduzca la cantidad a sumar: "));
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return SUMAR;
    }


}
