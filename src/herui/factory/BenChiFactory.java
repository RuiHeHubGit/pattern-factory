package herui.factory;

public class BenChiFactory implements Factory {
	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		return new BenChiCar();
	}

	public static Factory getFactory() {
		return FactoryInitor.FACTORY;
	}
	
	static class FactoryInitor{
		final static Factory FACTORY = new BenChiFactory();
	}

}
