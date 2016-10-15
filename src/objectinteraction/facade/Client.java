package objectinteraction.facade;

public class Client {

    public static void main(String[] args) {
    	// Facade
        Database database = new Database();	
        
        // Use DataLoad, DataSave and DataCount methods via Database facade
        database.loadTargetData(-1);
        database.loadAllData();
        database.saveData(null);
        database.countData();
    }
}