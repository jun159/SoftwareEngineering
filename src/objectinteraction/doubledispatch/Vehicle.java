package objectinteraction.doubledispatch;

public interface Vehicle {
	
	public void drive();
	
	public void collideBefore(Vehicle vehicle);
	
	public void collideAfter(Vehicle vehicle);
}
