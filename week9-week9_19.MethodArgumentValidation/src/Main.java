/**
 * Created by anastasia on 03/01/2017.
 */
public class Main {
    public static void main (String args[]) {
        Person person = new Person ("Anna", 37);
        try {
            System.out.println(person.printPerson());
        } catch (IllegalArgumentException ex) {
            ex.getMessage();
        }


    }
}
