package calculator;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoMementable{

	public ComandoDeshacer(CalculadoraMementable calculadora,
			GestorMementos<Memento> gm) {
		super(calculadora, gm);
	}

	@Override
	public void execute() {
		String[] puntosGuardados = this.getGestorMementos().keys();
		if(puntosGuardados.length > 0){
			Memento memento = this.getGestorMementos().getMemento(String.valueOf(IO.in.select(puntosGuardados, "selecciona punto guardado")));
			this.getCalculadoraMementable().restoreMemento(memento);
		}else{
			IO.out.println("No hay puntos guardados");
		}

	}

	@Override
	public String name() {		
		return "Deshacer";
	}

}
