package calculator;

import upm.jbb.IO;

public class ComandoSumar implements Comando {
    
    private static String SUMAR="sumar";
    private Calculadora calc;

    public ComandoSumar(Calculadora calc) {
        // TODO Auto-generated constructor stub
        this.calc=calc;
    }

    public void execute() {
        // TODO Auto-generated method stub
        calc.sumar(IO.in.readInt("Introducca la cantidad a sumar: "));
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return SUMAR;
    }


}
