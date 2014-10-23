package text;

public class FactoriaCaracter {

    private static FactoriaCaracter factoriaCaracteres;

	public static FactoriaCaracter getFactoria() {
    	if(FactoriaCaracter.factoriaCaracteres == null){
    		FactoriaCaracter.factoriaCaracteres = new FactoriaCaracter();
    	}
    	return FactoriaCaracter.factoriaCaracteres;
    }

}
