
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;

    }

    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> keys = new ArrayList<String>(dictionary.keySet());
        ArrayList<String> values = new ArrayList<String>(dictionary.values());
        ArrayList<String> resultList = new ArrayList<String>();
        String result = "";
        
        for (int i = 0; i < values.size(); i++) {
            result = keys.get(i) + " = " + values.get(i);
            resultList.add(result);
        }
        return resultList;
    }

}
