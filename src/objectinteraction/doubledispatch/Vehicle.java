package objectinteraction.doubledispatch;

public abstract class Vehicle {
	
	public void drive() {
		System.out.println("Brmmmm!");
	}
	
	public void collide(Vehicle vehicle) {
		System.out.println("Unspecified vehicle collide!");
	}
}
