import java.util.HashMap;
import java.util.Map;

/**
 * Created by anastasia on 05/01/2017.
 */
public class ContactBook {
    private Map<Person, Address> contactBook;

    public ContactBook() {
        this.contactBook = new HashMap<>();
    }

    public void addContact(Person person) {
        if (!this.has(person)) {
            this.contactBook.put(person, new Address());
        } else {
            System.out.println("This person is already in the contact book!");
        }
    }

    public boolean has(Person person) {
        for(Person key : contactBook.keySet()) {
            if (key.getName().toLowerCase().contains(person.getName().toLowerCase())) {
                return false;
            }
        }

        return true;
    }
}
