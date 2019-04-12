package car;

public class TestBuilderPattern {

	public static void main(String[] args) {
		
		CarBuilder carBuilder = new SedanCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);
		
		
		CarBuilder carBuilder2 = new SportsCarBuilder();
		CarDirector director2 = new CarDirector(carBuilder2);
		director2.build();
		Car car2 = carBuilder2.getCar();
		System.out.println(car2);
		 
	}
	
	
	
	
	

}
