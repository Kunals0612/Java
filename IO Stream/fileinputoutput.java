import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileinputoutput {
    public static void main(String[] args) {
        try {
            // Create a FileOutputStream to write data to a file
            FileOutputStream file = new FileOutputStream("/home/kunal/Desktop/kunal/Java/IO Stream/Test.txt");
            
            // Strings to be written to the file
            String str = "Learn Java Programming\n";
            String str1 = "Learn Cpp Programming\n";
            String str2 = "Learn Python Programming\n";
            
            // Convert str1 to byte array and write to file using a loop
            byte b[] = str1.getBytes();
            for(byte x : b) {
                file.write(x);  // Write each byte individually
            }
            
            // Write str to the file directly as a byte array
            file.write(str.getBytes());
            
            // Convert str2 to byte array and write to file using write method with offset and length
            byte b1[] = str2.getBytes();
            file.write(b1, 0, str2.length());
            
            // Close the FileOutputStream to free up system resources
            file.close();
        } catch (FileNotFoundException e) {
            // Handle the case where the file path is incorrect or the file does not exist
            System.out.println(e);
        } catch (IOException e) {
            // Handle input/output exceptions, such as issues during file writing
            System.out.println(e);
        }
    }
}
