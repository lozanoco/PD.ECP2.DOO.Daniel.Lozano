package factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber{

    private static final String[] textValue = {"zero", "one", "two", "tree", "four", "five"};

    public NaturalNumberEn(int value) {
        super(value);
    }

    public String getTextValue(int numero) {
            return NaturalNumberEn.textValue[numero];
    }

}
