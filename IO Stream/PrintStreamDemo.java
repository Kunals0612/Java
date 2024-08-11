import java.io.FileOutputStream;
import java.io.PrintStream;
class Student{
    public int roll_no;
    public String name;
    public String dept;
}
public class PrintStreamDemo {
    public static void main(String[] args) throws Exception
    {
         FileOutputStream fos = new FileOutputStream("Student1.txt");
         PrintStream ps = new PrintStream(fos);

         Student s = new Student();
         s.roll_no = 1;
         s.name = "Kunal";
         s.dept = "Comp";

         ps.println(s.roll_no);
         ps.println(s.name);
         ps.println(s.dept);

         ps.close();
         fos.close();

    }
}
