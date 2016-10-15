package architecture.sharedrepo;

import java.util.List;

/**
 * Retrieve data from Repository
 * Output all data
 */

public class Output {
	
	private Repository repository;
	private List<String> database;
	
	public Output() {
		this.repository = Repository.getInstance();
		this.database = repository.loadData();
	}
	
	public void output() {
		for(int i = 0; i < database.size(); i++) {
			System.out.println("Data[" + i + "]: " + database.get(i));
		}
	}
}
