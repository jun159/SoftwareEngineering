package objectinteraction.observer.pushmodel;

public class LightEffectController implements Observer {
	
	private boolean isLightFlickering = false;
	
	/**
	 * Push model: Observer simply sends the observer (LightEffectController)
	 * the data (xCoordinate) it needs 
	 * --> Only involves observer and data, no need observable [REDUCE COUPLING]
	 * 
	 * Does not check if current player xCoordinate > 0 
	 * but just take the yCoordinate gotten from parameter
	 */
	@Override
	public void update(Integer xCoordinate) { 
		if(xCoordinate > 10 && isLightFlickering == false) {
			flickerLights();
		}
	}
	
	private void flickerLights() {
		isLightFlickering = true;
		System.out.println("Flicker the lights");
	}
}