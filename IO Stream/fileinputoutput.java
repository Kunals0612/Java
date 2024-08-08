import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileinputoutput {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("/home/kunal/Desktop/kunal/Java/IO Stream/Test.txt");
            String str = "Learn Java Programming\n";
            String str1 = "Learn Cpp Programming\n";
            String str2 = "Learn Python Programming\n";
            byte b[] = str1.getBytes();
            for(byte x:b)
            {
                file.write(x);
            }
            file.write(str.getBytes());
            byte b1[] = str2.getBytes();
            file.write(b1,0,str2.length());
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
