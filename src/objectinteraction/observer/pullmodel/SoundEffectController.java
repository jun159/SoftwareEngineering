package objectinteraction.observer.pullmodel;

public class SoundEffectController implements Observer {
	
	private boolean isSoundPlaying = false;
	
	/**
	 * Pull model: Sends the observer (SoundEffectController) 
	 * to query the subject (Player) 
	 * on information (yCoordinate) it needs
	 * --> Involves observer, observable [HIGHER COUPLING] and data
	 * 
	 * Checks if current player yCoordinate > 0 
	 */
	@Override
	public void update(Player player) {
		Integer yCoordinate = player.getyCoordinate();
		if(yCoordinate > 0 && isSoundPlaying == false) {
			playSound();
		}
	}
	
	private void playSound() {
		isSoundPlaying = true;
		System.out.println("Play an eerie sound");
	}
}
