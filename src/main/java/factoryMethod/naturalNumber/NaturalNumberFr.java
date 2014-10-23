package factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber{

    private static final String[] textValue = {"zero", "un", "deux", "trois", "quatre", "cinq"};

    public NaturalNumberFr(int value) {
        super(value);
    }

    public String getTextValue(int numero) {
            return NaturalNumberFr.textValue[numero];
    }

}
