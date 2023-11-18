import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviationDic;


    public Abbreviations() {
        this.abbreviationDic = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationDic.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationDic.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviationDic.get(abbreviation);
    }








}
