package herui.factory;

public class CarFactory extends AbstractFactory{

	@Override
	Car getAouDiCar() {
		// TODO Auto-generated method stub
		return new AouDiCar();
	}

	@Override
	Car getBenChiCar() {
		// TODO Auto-generated method stub
		return new BenChiCar();
	}
	
	public static CarFactory getCarFactory() {
		return FactoryInitor.FACTORY;
	}
	
	static class FactoryInitor{
		final static CarFactory FACTORY = new CarFactory();
	}

}
