import java.io.FileInputStream;

public class fileinput {
    public static void main(String[] args) throws Exception
    {
        try(FileInputStream fis = new FileInputStream("/home/kunal/Desktop/kunal/Java/IO Stream/Test.txt"))
        { 
            byte b[] = new byte [fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str); 
        }
    }
}
