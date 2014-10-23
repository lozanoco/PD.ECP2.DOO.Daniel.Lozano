package composite.expresion;

public class Dividir extends Operacion {

	public Dividir(Expresion exp1, Expresion exp2) {
		super(exp1,exp2);
	}

	@Override
	public int operar() {
		return getExpresion1().operar()/getExpresion2().operar();
	}

	@Override
	public String toString() {
		return "("+getExpresion1()+" / "+getExpresion2()+")";
	}

}
