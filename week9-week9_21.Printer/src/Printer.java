import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by anastasia on 04/01/2017.
 */
public class Printer {
    private String fileName;
    private Scanner scanner;

    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        scanner = new Scanner(fileName);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if ( line.contains(word)) {
                System.out.println(line);
            } else if (word.isEmpty() || !fileName.contains(word)) {
                System.out.println(line);
            }
        }
        scanner.close();
    }


}
