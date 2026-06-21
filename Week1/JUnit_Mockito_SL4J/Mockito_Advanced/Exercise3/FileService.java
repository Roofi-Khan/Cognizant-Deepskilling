package Week1.JUnit_Mockito_SL4J.Mockito_Advanced.Exercise3;

public class FileService {

    private FileReader reader;
    private FileWriter writer;

    public FileService(FileReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String processFile() {

        String content = reader.read();

        writer.write(content);

        return "Processed " + content;
    }
}