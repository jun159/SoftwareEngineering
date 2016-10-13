package objectinteraction.facade;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();	// Facade
        database.loadTargetData(-1);
        database.loadAllData();
        database.saveData(null);
        database.countData();
    }
}