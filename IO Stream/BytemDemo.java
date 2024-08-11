import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.FileOutputStream;

public class BytemDemo {
    public static void main(String[] args) throws Exception
    {
        byte b[] = {'a','b','c','d','e','f','g','h'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int x;
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }
        System.out.println(bis.markSupported());

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        byte b1[] = bos.toByteArray();
        for(byte x1:b1)
        {
            System.out.println(x1);
        }
        bos.writeTo(new FileOutputStream("/home/kunal/Desktop/kunal/Java/IO Stream/Test.txt"));

        bis.close();

        char c[] = {'a','b','c','d','e'};
        CharArrayReader cr = new CharArrayReader(c);
        int x2;
        while((x2=cr.read())!=-1)
        {
            System.out.println((char)x2);
        }
        cr.close();
    }
}
