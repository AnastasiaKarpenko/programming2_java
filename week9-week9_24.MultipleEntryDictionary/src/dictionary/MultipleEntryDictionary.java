package dictionary;

import java.util.Set;

/**
 * Created by anastasia on 05/01/2017.
 */
public interface MultipleEntryDictionary {

    void add(String word, String entry);
    Set<String> translate(String word);
    void remove(String word);

}
