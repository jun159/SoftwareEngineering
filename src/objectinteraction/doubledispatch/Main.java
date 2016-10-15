package objectinteraction.doubledispatch;

public class Main {
	
	private Vehicle car;
	private Vehicle bike;
	
	public Main() {
		this.car = new Car();
		this.bike = new Bike();
	}
	
	private void run() {
		System.out.println("Before checking object type:");
		executeBefore();
		System.out.println("After checking object type:");
		executeAfter(bike);
		executeAfter(car);
	}
	
	/**
	 * Java is single dispatch, none of the methods below gets called!
	 * Compiler cannot decide the actual type of the vehicle used:
	 * Vehicle bike = new Bike();	// Cannot know Vehicle is actually Bike!
	 * Vehicle car = new Car();		// Cannot know Vehicle is actually Car!
	 * 
	 * Output: 
	 * Unspecified vehicle collide!
	 * Unspecified vehicle collide!
	 */
	private void executeBefore() {
		car.collide(bike);
		bike.collide(car);
	}
	
	/**
	 * Solution: Use instanceof to determine the type of the object
	 */
	private void executeAfter(Vehicle vehicle) {
		if(vehicle instanceof Bike) {
			System.out.println("Bike type");
			car.collide((Bike) vehicle);
		} else if(vehicle instanceof Car) {
			System.out.println("Car type");
			bike.collide((Car) vehicle);
		}
	}
	
	public static void main(String[] args) {		
		Main main = new Main();
		main.run();
	}
}
