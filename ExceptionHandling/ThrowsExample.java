import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException {
        // Simulating an IO operation that may throw IOException
        if (fileName.equals("test.txt")) {
            throw new IOException("File not found");
        } else {
            System.out.println("File read successfully");
        }
    }
}
