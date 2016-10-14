package objectinteraction.doubledispatch;

public class Bike extends Vehicle {

	public void drive() {
		System.out.println("Driving a bike!");
	}
	
	/**
	 * Java is single dispatch, none of the methods below gets called!
	 * Compiler cannot decide the actual type of the vehicle used:
	 * Vehicle bike = new Bike();	// Cannot know Vehicle is actually Bike!
	 * 
	 * Output: Unspecified vehicle collide!
	 */
	
	public void collide(Bike bike) {
		System.out.println("Bike crash!");
	}
	
	public void collide(Car car) {
		System.out.println("Bike hits Car!");
	}
}
