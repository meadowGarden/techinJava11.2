
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {}

    public static void printValues(HashMap<String, Book> map) {
        for (String key : map.keySet()) {
            System.out.println(map.get(key).toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> map, String text) {
        for (String key : map.keySet()) {
            if (map.get(key).getName().contains(text)) {
                System.out.println(map.get(key).toString());
            }
        }
    }

}
