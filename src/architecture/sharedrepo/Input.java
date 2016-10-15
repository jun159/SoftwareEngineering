package architecture.sharedrepo;

import java.util.List;

/**
 * Retrieve data from Repository
 * Input all data
 * Save data to Repository
 */

public class Input {
	
	private Repository repository;
	private List<String> database;
	
	public Input() {
		this.repository = Repository.getInstance();
		this.database = repository.loadData();
	}
	
	public void input() {
		database.add("Data A");
		database.add("Data B");
		database.add("Data C");
		database.add("Data D");
		database.add("Data E");
		repository.saveData(database);
	}
}
