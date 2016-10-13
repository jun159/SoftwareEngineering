package objectinteraction.facade;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        String data = database.loadTargetData(-1);
        ArrayList<String> allData = database.loadAllData();
        database.saveData(null);
    }
}