package objectinteraction.facade;

import java.util.*;

/**
 * Database is a facade that hides DataLoad, DataSave and DataCount.
 * Classes that wants to use methods in DataLoad, DataSave and DataCount
 * have to go through via Database facade only.
 */

public class Database {

    private DataLoad dataLoad;
    private DataSave dataSave;
    private DataCount dataCount;

    public Database() {
        this.dataLoad = new DataLoad();
        this.dataSave = new DataSave();
        this.dataCount = new DataCount();
    }

    public String loadTargetData(int key) {
        return dataLoad.loadTargetData(key);
    }

    public ArrayList<String> loadAllData() {
        return dataLoad.loadAllData();
    }

    public void saveData(String data) {
        dataSave.saveData(data);
    }
    
    public int countData() {
    	return dataCount.countTargetData();
    }
}