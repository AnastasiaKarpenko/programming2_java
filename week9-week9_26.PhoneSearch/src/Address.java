/**
 * Created by anastasia on 05/01/2017.
 */
public class Address {
    private String city;
    private String street;

    public Address() {
        this.city = null;
        this.street = null;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String printAddress() {
        return "address: " + this.street + " " + this.city;
    }
}
