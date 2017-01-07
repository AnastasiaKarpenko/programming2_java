import java.util.HashSet;
import java.util.Set;

/**
 * Created by anastasia on 05/01/2017.
 */
public class Person {
    private String name;
    private Set<Address> addresses;
    private Set<String> phoneNumbers;

    public Person(String name) {
        this.name = name;
        this.addresses = new HashSet<>();
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

    public boolean containsAddress(String name) {
        for(Address address : addresses) {
            if(address.getCity().toLowerCase().contains(name.toLowerCase()) ||
                    address.getStreet().toLowerCase().contains(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public Set<String> getNumber() {
        return phoneNumbers;
    }

    public void setAddress(String street, String city) {
        Address address = new Address();
        address.setStreet(street);
        address.setCity(city);
        addresses.add(address);
    }

    public Set<Address> getAddress() {
        return addresses;
    }









}
