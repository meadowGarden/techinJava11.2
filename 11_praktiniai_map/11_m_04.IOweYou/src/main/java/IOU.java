import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> debtBook;

    public IOU() {
        this.debtBook = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        if (toWhom.isEmpty()) {
            return;
        }
        debtBook.put(toWhom, amount);

    }

    public double howMuchDoIOweTo(String toWhom) {
        if (debtBook.get(toWhom) != null) {
            return debtBook.get(toWhom);
        }
        return 0.0;
    }

    public String toString() {
        String stringToReturn = "";
        for (String key : debtBook.keySet()) {
            stringToReturn = stringToReturn.concat(key);
            stringToReturn = stringToReturn.concat(" - ");
            stringToReturn = stringToReturn.concat(String.valueOf(debtBook.get(key)));
            stringToReturn = stringToReturn.concat("\n");
        }
        return stringToReturn;
    }

}
