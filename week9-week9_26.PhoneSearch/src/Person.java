import java.util.HashSet;
import java.util.Set;

/**
 * Created by anastasia on 05/01/2017.
 */
public class Person {
    private String name;
    private Set<Address> address;
    private Set<String> phoneNumbers;

    public Person(String name) {
        this.name = name;
        this.address = new HashSet<>();
        this.phoneNumbers = new HashSet<>();
    }

    public String getName() {
        return this.name;
    }

    public void setNumber(String number) {
        if(isNew(number)) {
            phoneNumbers.add(number);
        }
    }

    public boolean isNew(String number) {
        if (phoneNumbers.contains(number)) {
            return false;
        }
        return true;
    }

    public Set<String> getNumber() {
        return this.phoneNumbers;
    }




}
