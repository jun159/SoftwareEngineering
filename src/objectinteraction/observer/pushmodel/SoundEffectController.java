package objectinteraction.observer.pushmodel;

public class SoundEffectController implements Observer {
	
	private boolean isSoundPlaying = false;
	
	/**
	 * Push model: Simply sends the observer (SoundEffectController)
	 * the data (yCoordinate) it needs 
	 * --> Only involves observer and data, no need observable [REDUCE COUPLING]
	 * 
	 * Does not check if current player yCoordinate > 0 
	 * but just take the yCoordinate gotten from parameter
	 */
	@Override
	public void update(Integer yCoordinate) {
		if(yCoordinate > 0 && isSoundPlaying == false) {
			playSound();
		}
	}
	
	private void playSound() {
		isSoundPlaying = true;
		System.out.println("Play an eerie sound");
	}
}
