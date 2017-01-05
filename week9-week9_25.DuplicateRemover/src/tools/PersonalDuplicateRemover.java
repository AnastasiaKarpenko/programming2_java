package tools;

import org.omg.CORBA.PERSIST_STORE;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by anastasia on 05/01/2017.
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private int amountDuplicates;
    private Set<String> strings;

    public PersonalDuplicateRemover() {
        this.amountDuplicates =  0;
        this.strings = new HashSet<>();

    }

    @Override
    public void add(String characterString) {
        if(strings.contains(characterString)) {
            amountDuplicates++;
        } else {
            strings.add(characterString);

        }
    }


    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.amountDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.strings;
    }

    @Override
    public void empty() {
        this.strings.removeAll(this.strings);
        this.amountDuplicates = 0;

    }
}
