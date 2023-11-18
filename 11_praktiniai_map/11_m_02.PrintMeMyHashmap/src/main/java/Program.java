
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        printKeys(map);

    }

    public static void printKeys(HashMap<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key);;
        }
    }


    public static void printKeysWhere(HashMap<String, String> map, String text) {
        for (String key : map.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> map, String text) {
        for (String key : map.keySet()) {
            if (key.contains(text)) {
                System.out.println(map.get(key));
            }
        }
    }









}
