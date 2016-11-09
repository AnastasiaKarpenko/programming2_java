
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement:\n"
                + "  quit - quit the text user interface");
        System.out.println("Statement: ");
        String command = reader.nextLine();
        if (command.equals("quit")) {
            System.out.println("Cheers!");
        } else {
            System.out.println("Unknown statement");
        }
        
    }

}
