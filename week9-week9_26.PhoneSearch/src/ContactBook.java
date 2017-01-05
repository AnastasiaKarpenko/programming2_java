import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by anastasia on 05/01/2017.
 */
public class ContactBook {
    private Map<String, Person> contactBook;

    public ContactBook() {
        this.contactBook = new HashMap<>();
    }

    public void addContact(Person person) {
        if (!this.has(person.getName().toLowerCase())) {
            this.contactBook.put(person.getName().toLowerCase(), person);
        } else {
            System.out.println("This person is already in the contact book!Insert another name");
        }
    }

    public boolean has(String name) {
        return contactBook.containsKey(name.toLowerCase());

    }

    public void addNumber(String name, String number) {
        this.contactBook.get(name.toLowerCase()).setNumber(number);
    }

    public Set<String> searchNumber(String name) {
        return this.contactBook.get(name.toLowerCase()).getNumber();
    }

    


}
