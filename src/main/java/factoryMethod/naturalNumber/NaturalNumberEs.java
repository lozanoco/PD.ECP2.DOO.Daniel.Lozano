package factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber{

    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
        super(value);
    }
    @Override
    public String obtenerValorTexto(int numero) {
            return NaturalNumberEs.textValue[numero];
    }

}
