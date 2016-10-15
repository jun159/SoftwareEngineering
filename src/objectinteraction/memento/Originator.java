package objectinteraction.memento;

public class Originator {
	private String state;
	
	public void setState(String state) {
		// Set current state
		this.state = state;
	}
	
	public String getState() {
		// Get current state
		return state;
	}
	
	public Memento saveStateToMemento() {
		// Save current state in CareTaker list
		return new Memento(state);
	}
	
	public void getStateFromMemento(Memento memento) {
		// Get state from Memento
		state = memento.getState();
	}
}