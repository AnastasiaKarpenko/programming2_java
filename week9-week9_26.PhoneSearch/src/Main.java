/**
 * Created by anastasia on 06/01/2017.
 */
public class Main {
    public static void main (String args[]) {

        Person pekka = new Person("Pekka");
        pekka.setNumber("080-2030303");
        pekka.setAddress("Otaranta", "Espoo");


        Person jukka = new Person("Jukka");
        jukka.setNumber("089-2030303");
        jukka.setAddress("Otakaari", "Espoo");


        Person olli = new Person("Olli");
        olli.setNumber("089-2039993");
        olli.setAddress("Kohenementie", "Espoo");


        UserInterface ui = new UserInterface();

        ui.getBook().addContact(pekka);
        ui.getBook().addContact(jukka);
        ui.getBook().addContact(olli);

        ui.printMenu();
        ui.getCommand();

    }

}
