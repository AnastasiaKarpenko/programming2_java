import java.util.*;

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

    public String searchNameByNumber(String number) {
        for (Person person : this.contactBook.values()) {
            if (person.getNumber().contains(number)) {
                return person.getName();
            }
        }
        return "Not found";
    }

    public Map<String, Person> getContactBook() {
        return this.contactBook;
    }

    public void addAddress(String name, String street, String city) {
        for (String key : this.contactBook.keySet()) {
            if (key.toLowerCase().contains(name.toLowerCase())) {
                this.contactBook.get(key).setAddress(street, city);
            }
        }
    }

    public Set<Address> searchAddress(String name) {
        if (contactBook.get(name.toLowerCase()).getAddress().isEmpty()) {
            return Collections.emptySet();
        } else {
            return contactBook.get(name.toLowerCase()).getAddress();

        }
    }

    public void removeContact(String name) {
        if (contactBook.containsKey(name.toLowerCase())) {
            contactBook.remove(name);
        } else {
            System.out.println("Name not found");
        }
    }

    public Set<Person> searchByWord(String word) {
        Set<Person> people = new HashSet<>();
        for (Person person : getContactBook().values()) {
            if (person.getName().toLowerCase().contains(word.toLowerCase())
                    || person.containsAddress(word.toLowerCase())) {
                people.add(person);
            }
        }
        return people;
    }

}








