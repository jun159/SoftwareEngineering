package objectinteraction.observer.pushmodel;

import java.util.ArrayList;
import java.util.List;

public class Player implements Observable {
	
	private List<Observer> observers;
	private Integer xCoordinate;
	private Integer yCoordinate;
	
	public Player() {
		this.observers = new ArrayList<Observer>();
		this.xCoordinate = 0;
		this.yCoordinate = 0;
	}
	
	public Integer getxCoordinate() {
		return xCoordinate;
	}
	
	public void setxCoordinate(Integer xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	
	public Integer getyCoordinate() {
		return yCoordinate;
	}
	
	public void setyCoordinate(Integer yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public void moveForward(Integer steps) {
		xCoordinate += steps;
		notifyObservers();
	}
	
	public void moveBackward(Integer steps) {
		xCoordinate -= steps;
		notifyObservers();
	}
	
	public void jump(Integer steps) {
		yCoordinate += steps;
		notifyObservers();
	}
	
	public void fallTo(Integer steps) {
		yCoordinate -= steps;
		notifyObservers();
	}
	
	/**
	 * Push model: Observable sends directly to the observer all the data it will need. 
	 * The observer doesn't need to query the observable for information.
	 * 
	 * Player sends directly to the observer the coordinates.
	 * Observers (LightEffectController + SoundEffectController) do not need to query
	 * player for information, just use coordinates given by player.
	 */
	
	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			if(o instanceof SoundEffectController) {
				o.update(yCoordinate);
			} else if(o instanceof LightEffectController) {
				o.update(xCoordinate);
			}
		}
	}

	@Override
	public void addObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}
}
