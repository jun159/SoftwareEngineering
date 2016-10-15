package objectinteraction.observer.pushmodel;

public class Client {

	public static void main(String[] args) {
		// Pull model - Cost of communication is subject to observers pulling state from observable
		
		System.out.println("Push model");
		Player playerPull = new Player();
		
		playerPull.addObserver(new SoundEffectController());
		playerPull.addObserver(new LightEffectController());
				
		playerPull.moveForward(2);
		playerPull.moveForward(3);
		playerPull.moveForward(7);
		playerPull.jump(3);
		
	}
}
