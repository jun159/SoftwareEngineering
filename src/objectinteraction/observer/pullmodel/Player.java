package objectinteraction.observer.pullmodel;

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
	 * Pull model: Observable merely notifies the observer that something happened, 
	 * and the Observer queries the subject based to get the information it needs.
	 * 
	 * Player notifies the observer that it has moved.
	 * Observers (LightEffectController + SoundEffectController) need to query
	 * player's information (coordinates).
	 */
	
	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(this);
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
