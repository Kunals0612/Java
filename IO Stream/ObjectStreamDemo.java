import java.io.*;
class Student implements Serializable{
    private int roll_no;
    private String name;
    private String Dept;
    private float avg;
    public static int Data = 10;
    public transient int t;

    public Student()
    {

    }
    public Student(int r, String n, float a, String d)
    {
        roll_no = r;
        name = n;
        Dept = d;
        avg = a;
        Data = 500;
        t = 500;
    }
    public String toString()
    {
        return "\nStudnet Details\n"+
               "\nRoll "+ roll_no+
               "\nName "+ name+
               "\nAverage "+ avg+
               "\nDept "+ Dept+
               "\nData "+ Data+
               "\nTransient "+ t +"\n";
    }
}
public class ObjectStreamDemo {
    // public static void main(String[] args)throws Exception
    // {
    //      FileOutputStream fos = new FileOutputStream("Student3.txt");
    //      ObjectOutputStream oos = new ObjectOutputStream(fos);

    //      Student s = new Student(1,"John",89.9f,"CSE");

    //      oos.writeObject(s);

    //      fos.close();
    //      oos.close();
    // }
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student)ois.readObject();

        System.out.println(s);

        fis.close();
        ois.close();
    }
}
