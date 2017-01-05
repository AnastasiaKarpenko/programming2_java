package tools;

import java.util.Set;

/**
 * Created by anastasia on 05/01/2017.
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private String characterString;
    private int amountDuplicates;

    @Override
    public void add(String characterString) {

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return 0;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return null;
    }

    @Override
    public void empty() {

    }
}
