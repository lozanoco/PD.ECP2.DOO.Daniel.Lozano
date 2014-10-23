package text;

import java.util.HashMap;
import java.util.Map;


public class FactoriaCaracter {
	
	private final Map<Character, Caracter> map = new HashMap<Character, Caracter>();
    private static FactoriaCaracter factoriaCaracteres;

	public static FactoriaCaracter getFactoria() {
    	if(FactoriaCaracter.factoriaCaracteres == null){
    		FactoriaCaracter.factoriaCaracteres = new FactoriaCaracter();
    	}
    	return FactoriaCaracter.factoriaCaracteres;
    }

	public Caracter get(char clave) {
		if (map.containsKey(clave)) {
            return map.get(clave);
        } else {
            Caracter caracter = new Caracter(clave);
            map.put(clave, caracter);
            return caracter;
        }
	}

}
