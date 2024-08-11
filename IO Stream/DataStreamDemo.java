import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

class Student{
    int roll_no;
    String name;
    String dept;
}
public class DataStreamDemo {
    public static void main(String[] args)throws Exception
    {
         FileOutputStream fos = new FileOutputStream("student2.txt");
         DataOutputStream dos = new DataOutputStream(fos);
         Student s = new Student();
         s.roll_no = 1;
         s.name = "Kunal";
         s.dept = "Comp";

         dos.writeInt(s.roll_no);
         dos.writeUTF(s.name);
         dos.writeUTF(s.dept);

         dos.close();
         fos.close();
    }
}
