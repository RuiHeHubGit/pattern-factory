package herui.factory;

public class FactoryTest {
	public static void main(String[] args) {
		Factory aoudiFcy = AouDiFactory.getFactory();
		System.out.println(aoudiFcy.getCar().getName());
		
		Factory benchiFcy = BenChiFactory.getFactory();
		System.out.println(benchiFcy.getCar().getName());
		
		CarFactory carFactory = CarFactory.getCarFactory();
		System.out.println(carFactory.getAouDiCar().getName());
		System.out.println(carFactory.getBenChiCar().getName());
	}
}
