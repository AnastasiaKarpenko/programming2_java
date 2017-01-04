package file;

import java.io.File;

/**
 * Created by anastasia on 04/01/2017.
 */
public class Analysis {
    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() {
        return (int) file.length();
    }
}
