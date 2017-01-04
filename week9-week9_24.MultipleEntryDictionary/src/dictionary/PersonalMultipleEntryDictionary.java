package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by anastasia on 05/01/2017.
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<>();
    }


    @Override
    public void add(String word, String entry) {
        if (!dictionary.containsKey(word)) {
            dictionary.put(word, new HashSet<String>());
        }

            dictionary.get(word).add(entry);

    }

    @Override
    public Set<String> translate(String word) {
        if(!dictionary.containsKey(word)) {
            return null;
        } else {

        }

        return dictionary.get(word);
    }

    @Override
    public void remove(String word) {
        dictionary.remove(word);

    }
}
