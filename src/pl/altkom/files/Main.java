package pl.altkom.files;

public class Main {
    public static void main(String[] args) {
        FileReader reader = new FileReaderImpl();
        System.out.println(reader.readFile("/home/student/IdeaProjects/2019-10-26/src/pl/altkom/files/FileReaderImpl.java"));
    }
}
