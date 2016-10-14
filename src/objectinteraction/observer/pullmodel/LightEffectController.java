package objectinteraction.observer.pullmodel;

public class LightEffectController implements Observer {
	
	private boolean isLightFlickering = false;
	
	/**
	 * Pull model: Sends the observer (LightEffectController) 
	 * to query the subject (Player) 
	 * on information (xCoordinate) it needs
	 * --> Involves observer, observable [HIGHER COUPLING] and data
	 * 
	 * Checks if current player xCoordinate > 0 
	 */
	@Override
	public void update(Player player) {
		Integer xCoordinate = player.getxCoordinate();
		if(xCoordinate > 10 && isLightFlickering == false) {
			flickerLights();
		}
	}
	
	private void flickerLights() {
		isLightFlickering = true;
		System.out.println("Flicker the lights");
	}
}
