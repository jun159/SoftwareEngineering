package architecture.sharedrepo;

import java.util.List;

/**
 * Retrieve data from Repository
 * Circular Shift data
 * Save data to Repository
 */
public class CircularShift {

	private Repository repository;
	private List<String> database;
	
	public CircularShift() {
		this.repository = Repository.getInstance();
		this.database = repository.loadData();
	}
	
	public void circularShift() {
		// Circular shift data
		repository.saveData(database);
	}
}
