import java.util.Scanner;
import java.util.Set;

/**
 * Created by anastasia on 06/01/2017.
 */
public class UserInterface {
    private Scanner reader;
    private ContactBook book;

    public UserInterface() {
        reader = new Scanner(System.in);
        book = new ContactBook();
    }

    public ContactBook getBook() {
        return this.book;
    }

    public static void printMenu() {
        System.out.println("phone search");
        System.out.println("available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit\n");
    }

    public void getCommand() {
        loop: while (true) {
            System.out.println(" ");
            System.out.println("command: ");
            String command = reader.next();

            switch (command) {
                case "x":
                    break loop;
                case "1":
                    addNumber();
                    break;
                case "2":
                    printNumber(searchNumber());
                    break;
                case "3":
                    printName();
                    break;
                case "4":
                    addAddress();
                    break;
                case "5":
                    printInfoByNameInput();
                    break;
                case "6":
                    removeInformation();
                    break;
                case "7":
                    printInfoByCharInput();
                    break;
            }
        }
    }

    public void addNumber() {
        System.out.println("whose name: ");
        String name = reader.next();

        System.out.println("which number: ");
        String number = reader.next();
        book.addNumber(name, number);
    }

    public Set<String> searchNumber() {
        System.out.println("whose number: ");
        String name = reader.next();
        return book.searchNumber(name);
    }

    public void printNumber(Set<String> set) {
        System.out.println("Phone numbers: ");
        if(set.isEmpty()) {
            System.out.print(" unknown");
        } else {
            for (String number : set) {
                System.out.println(number);
            }
        }

    }

    public String searchName() {
        System.out.println("number: ");
        String number = reader.next();
        return book.searchNameByNumber(number);
    }

    public void printName() {
        System.out.println(searchName());
    }

    public void addAddress() {
        System.out.println("whose address: ");
        String name = reader.next();

        System.out.println("street: ");
        String street = reader.next();

        System.out.println("city: ");
        String city = reader.next();
        book.addAddress(name, street, city);
    }

    public void printAddress(Set<Address> set) {
        System.out.println("Address: ");
        if(set.isEmpty()) {
            System.out.print(" unknown");
        } else {
            for (Address address : set) {
                System.out.println(address.printAddress());
            }
        }
    }


    public void printInfoByNameInput() {
        System.out.println("whose name: ");
        String name = reader.next();

        if(!book.getContactBook().containsKey(name)) {
            System.out.println("Not found");
        } else {
            printInformation(name);
        }
    }

    public void printInformation(String name) {
        System.out.println(book.getContactBook().get(name.toLowerCase()).getName());
        printAddress(book.searchAddress(name));
        System.out.println("");
        printNumber(book.searchNumber(name));
    }

    public void removeInformation() {
        System.out.println("whose information: ");
        String name = reader.next();
        book.removeContact(name);
    }

    public void printInfoByCharInput() {
        System.out.println("keyword: ");
        String name = reader.next();

        Set<Person> people = book.searchByWord(name.toLowerCase());

        if(!name.equals(null) || !name.equals(" ")) {
            if(!people.isEmpty()) {
                for(Person person : people) {
                    printInformation(person.getName().toLowerCase());
                    System.out.println(" ");
                }
            } else {
                System.out.println("Keyword not found");
            }

        } else {
            for (Person person : book.getContactBook().values()) {
                printInformation(person.getName());
                System.out.println(" ");
            }
        }

    }



}






