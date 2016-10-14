package objectinteraction.doubledispatch;

public class Car extends Vehicle {

	public void drive() {
		System.out.println("Driving a car!");
	}
	
	/**
	 * Java is single dispatch, none of the methods below gets called!
	 * Compiler cannot decide the actual type of the vehicle used:
	 * Vehicle car = new Car();		// Cannot know Vehicle is actually Car!
	 * 
	 * Output: Unspecified vehicle collide!
	 */
	
	public void collide(Car car) {
		System.out.println("Car crash!");
	}
	
	public void collide(Bike bike) {
		System.out.println("Car hits Bike!");
	}
}
