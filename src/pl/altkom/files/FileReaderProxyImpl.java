package pl.altkom.files;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FileReaderProxyImpl implements FileReader {
    private FileReader originalReader;
    private Set<String> passwords;


    public FileReaderProxyImpl() {
        originalReader = new FileReaderImpl();
        passwords = new HashSet<>();
        passwords.add("password");
        passwords.add("Password");
        passwords.add("P@ssw0rd");
    }

    @Override
    public String readFile(String path) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (passwords.contains(s)) {
            return originalReader.readFile(path);
        } else {
            return null;
        }
    }
}
