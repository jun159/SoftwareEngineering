package objectinteraction.doubledispatch;

public class Bike implements Vehicle {

	public void drive() {
		System.out.println("Driving a bike!");
	}
	
	/**
	 * Java is single dispatch, none of the methods below gets called!
	 * Compiler cannot decide the actual type of the vehicle used:
	 * collideBefore(car) Cannot know Vehicle is actually Car, only recognize as Vehicle!
	 * 
	 * Output: Bike crash!
	 */
	
	public void collideBefore(Vehicle vehicle) {
		System.out.println("Bike crash!");
	}
	
	public void collideBefore(Car car) {
		System.out.println("Bike hits Car!");
	}
	
	/**
	 * Solution: Use instanceof to determine the type of the object
	 * 
	 * Output: Bike hits car!
	 */
	public void collideAfter(Vehicle vehicle) {
		if(vehicle instanceof Car) {
			collideAfter((Car) vehicle);
		} else {
			System.out.println("Bike crash!");
		}
	}
	
	public void collideAfter(Car car) {
		System.out.println("Bike hits Car!");
	}
}
