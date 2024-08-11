import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
class Student1{
    public int roll_no;
    public String name;
    public String dept;
}
public class PrintStreamDemo2 {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student s = new Student();
        s.roll_no = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println("Roll_no: "+s.roll_no);
        System.out.println("Name: "+s.name);
        System.out.println("Dept: "+s.dept);

        br.close();
        fis.close();
    }
}
