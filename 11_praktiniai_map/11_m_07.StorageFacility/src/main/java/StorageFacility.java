import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap();
    }

    public void add(String unit, String item) {
        if (!storage.containsKey(unit)) {
            storage.put(unit, new ArrayList<>());
        }
        storage.get(unit).add(item);
    }

    public void remove(String unit, String item) {
        if (!storage.get(unit).contains(item)) {
            return;
        }

        storage.get(unit).remove(item);
        if (storage.get(unit).isEmpty()) {
            storage.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> listOfUnits = new ArrayList<>();
//        for (String unit : storage.keySet()) {
//            listOfUnits.add(unit);
//        }
        listOfUnits.addAll(storage.keySet());
        return listOfUnits;
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!storage.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        return storage.get(storageUnit);
    }

}
