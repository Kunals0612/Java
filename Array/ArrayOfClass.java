class Student{
    public int roll_no;
    public String name;
    public Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
public class ArrayOfClass {
    public static void main(String[] args)
    {
        Student[] arr;
        arr = new Student[2];
        arr[0] = new Student(1,"ABC");
        arr[1] = new Student(2, "BCD");

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Roll No is: "+arr[i].roll_no+" Name is: "+ arr[i].name);
        }
    }
}
