package factoryMethod.naturalNumber;

public abstract class FactoryNumber {
    private NaturalNumber number;
    private NaturalNumberCreator creator;

    public void setNaturalNumberCreator(NaturalNumberCreator creator){
    	this.creator=creator;
    }
    public void createNaturalNumber(){
    	this.number = creator.createNaturalNumber(number.getValue());
    }
    public NaturalNumber getNaturalNumber(){
    	return this.number;
    }

}
