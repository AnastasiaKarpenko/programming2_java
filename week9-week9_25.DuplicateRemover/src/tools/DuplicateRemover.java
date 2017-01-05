package tools;

import java.util.Set;

/**
 * Created by anastasia on 05/01/2017.
 */
public interface DuplicateRemover {
    void add(String characterString);
    int getNumberOfDetectedDuplicates();
    Set<String> getUniqueCharacterStrings();
    void empty();

}
