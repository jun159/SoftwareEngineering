package objectinteraction.doubledispatch;

public class Car implements Vehicle {

	public void drive() {
		System.out.println("Driving a car!");
	}
	
	/**
	 * Java is single dispatch, none of the methods below gets called!
	 * Compiler cannot decide the actual type of the vehicle used:
	 * collideBefore(bike) Cannot know Vehicle is actually Bike, only recognize as Vehicle!
	 * 
	 * Output: Car crash!
	 */
	
	public void collideBefore(Vehicle vehicle) {
		System.out.println("Car crash!");
	}
	
	public void collideBefore(Bike bike) {
		System.out.println("Car hits Bike!");
	}
	
	/**
	 * Solution: Use instanceof to determine the type of the object
	 * 
	 * Output: Car hits bike!
	 */
	public void collideAfter(Vehicle vehicle) {
		if(vehicle instanceof Bike) {
			collideAfter((Bike) vehicle);
		} else {
			System.out.println("Car crash!");
		}
	}
	
	public void collideAfter(Bike bike) {
		System.out.println("Car hits bike!");
	}
}
