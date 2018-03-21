package herui.factory;

public class AouDiFactory implements Factory {

	@Override
	public Car getCar() {
		return new AouDiCar();
	}

	public static Factory getFactory() {
		return FactoryInitor.FACTORY;
	}
	
	static class FactoryInitor{
		final static Factory FACTORY = new AouDiFactory();
	}

}
