package objectinteraction.observer.pullmodel;

public interface Observable {
	
	public void notifyObservers();
	
	public void addObserver(Observer o);
	
	public void removeObserver(Observer o);
}
