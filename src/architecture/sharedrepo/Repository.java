package architecture.sharedrepo;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	
	private static Repository repository;
	private List<String> database;
	
	public static Repository getInstance() {
		if(repository == null) {
			repository = new Repository();
		}
		
		return repository;
	}
	
	private Repository() {
		this.database = new ArrayList<String>();
	}

	public List<String> loadData() {
		return database;
	}

	public void saveData(List<String> database) {
		this.database = database;
	}
}
