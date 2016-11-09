
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
                + " quit - quit the text user interface\n"
                + " add - adds a word pair to the dictionary\n"
                + " translate - asks a word and prints its translation\n");

        while (true) {
            System.out.println("Statement: ");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                this.add();
            } else if (command.equals("translate")) {
                this.translate();
            } else {
                System.out.println("Unknown statement");
            }
        }

    }

    public void add() {
        System.out.println("In Finnish: ");
        String finnishWord = reader.nextLine();
        System.out.println("Translation: ");
        String englishWord = reader.nextLine();
        dictionary.add(finnishWord, englishWord);
    }

    public void translate() {
        System.out.println("Give a word: ");
        String word = reader.nextLine();
        String translatedWord = this.dictionary.translate(word);
        System.out.println("Translation: " + translatedWord);
        
    }

}
