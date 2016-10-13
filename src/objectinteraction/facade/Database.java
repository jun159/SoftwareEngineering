package objectinteraction.facade;

import java.util.*;

/**
 * Database is a facade that hides DataLoad and DataSave.
 */

public class Database {

    private DataLoad dataLoad;
    private DataSave dataSave;

    public Database() {
        this.dataLoad = new DataLoad();
        this.dataSave = new DataSave();
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
}