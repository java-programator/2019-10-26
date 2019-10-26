package pl.altkom.files;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderImpl implements FileReader {
    @Override
    public String readFile(String path) {
        String result = "";
        try {
            Scanner sc = new Scanner(new FileInputStream(path));
            while (sc.hasNext()) {
                result += sc.nextLine() + "\n";
            }
        } catch (IOException e) {

        }
        return result;
    }
}
