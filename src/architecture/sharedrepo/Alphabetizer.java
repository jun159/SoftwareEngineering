package architecture.sharedrepo;

import java.util.Collections;
import java.util.List;

/**
 * Retrieve data from Repository
 * Sort data
 * Save data to Repository
 */

public class Alphabetizer {
	
	private Repository repository;
	private List<String> database;
	
	public Alphabetizer() {
		this.repository = Repository.getInstance();
		this.database = repository.loadData();
	}
	
	public void alphabetize() {
		Collections.sort(database);
		repository.saveData(database);
	}
}
