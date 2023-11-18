import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registry.containsKey(licensePlate)) {
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) {
            return false;
        }
        registry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate item : registry.keySet()) {
            System.out.println(item.toString());
        }
    }

    public void printOwners() {
        Set<String> owners = new HashSet<>();
        for (LicensePlate item : registry.keySet()) {
            owners.add(registry.get(item));
        }
        for (String item : owners) {
            System.out.println(item);
        }
    }

}
