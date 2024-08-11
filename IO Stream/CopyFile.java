import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("/home/kunal/Desktop/kunal/Java/IO Stream/Source1.txt");
        FileOutputStream fos = new FileOutputStream("/home/kunal/Desktop/kunal/Java/IO Stream/Source2.txt");
        int b;
        while((b=fis.read())!=-1)
        {
            if(b>=65 && b<=90)
            {
                fos.write(b);
            }
            else
            {
                fos.write(b);
            }
        }
        fis.close();
        fos.close();
    }
}
