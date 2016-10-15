package objectinteraction.observer.pullmodel;

public class Client {

	public static void main(String[] args) {
		// Push model - Cost of communication is subject to push state to ALL observers
		
		System.out.println("Pull model");
		Player playerPush = new Player();
		playerPush.addObserver(new SoundEffectController());
		playerPush.addObserver(new LightEffectController());
		
		playerPush.moveForward(2);
		playerPush.moveForward(3);
		playerPush.moveForward(7);
		playerPush.jump(3);
	}
}
