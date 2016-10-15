package objectinteraction.doubledispatch;

public class Client {
	
	private Vehicle car;
	private Vehicle bike;
	
	public Client() {
		this.car = new Car();
		this.bike = new Bike();
	}
	
	private void run() {
		System.out.println("Before checking object type:");
		executeBefore();
		System.out.println("\nAfter checking object type:");
		executeAfter();
	}
	
	/**
	 * Java is single dispatch, none of the methods below gets called!
	 * Compile time cannot decide the actual type of the vehicle used:
	 * car.collideBefore(bike)		// Cannot know Vehicle argument is actually Bike!
	 * bike.collideBefore(car)		// Cannot know Vehicle argument is actually Car!
	 * 
	 * Output: 
	 * Car crash!
	 * Bike crash!
	 */
	private void executeBefore() {
		this.car.collideBefore(bike);
		this.bike.collideBefore(car);
	}
	
	/**
	 * Solution: Use instanceof to determine the type of the object
	 * Run time can decide the actual type of the vehicle used:
	 * car.collideBefore(bike)		// Can know Vehicle argument is actually Bike!
	 * bike.collideBefore(car)		// Can know Vehicle argument is actually Car!
	 * 
	 * Output: 
	 * Car hits bike!
	 * Bike hits car!
	 */
	private void executeAfter() {
		this.car.collideAfter(bike);
		this.bike.collideAfter(car);
	}
	
	public static void main(String[] args) {		
		Client main = new Client();
		main.run();
	}
}
