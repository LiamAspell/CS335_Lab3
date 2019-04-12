package car;


public class SportsCarBuilder implements CarBuilder{
	
	private final Car car = new Car("Ferrari");
	
	@Override
	public void buildBodyStyle() {
		car.setBodyStyle("External dimensions: overall length (inches): 230, " +
				"overall width (inches): 70, overall height (inches): 55, wheelbase (inches): 100," +
				" front track (inches): 60 rear track (inches): 60 and curb to curb turning circle (feet): 40");
	}
	
	@Override
	public void buildPower(){
		car.setPower(" its maximum torque produced is 505 Nm (372 ft-lbs) at 5,000 rpm");
	}

	@Override
	public void buildEngine() {
		car.setEngine("4.5 L Ferrari F136 F V8");
	}

	@Override
	public void buildBreaks() {
		car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution. ABS System");
	}

	@Override
	public void buildSeats() {
		car.setSeats("2 Seats.Front seat center armrest.Rear seat center armrest.");
	}

	@Override
	public void buildWindows() {
		car.setWindows("Tinted side windows.Fixed rear window with defroster");
		
	}

	@Override
	public void buildFuelType() {

		car.setFuelType("Diesel, Fuel Tank Capacity, Approx (gal) 20.6");
		
	}
	
	@Override
	public Car getCar(){
		return car;
	}
	
}
