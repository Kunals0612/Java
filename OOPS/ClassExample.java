public class ClassExample{
    static String name;
    static int roll_no;

    public static void set(String n, int rn)
    {
        name = n;
        roll_no = rn;
    }
    
    public static void display()
    {
        System.out.println("Name is: "+ name);
        System.out.println("Roll_no is: "+roll_no);
    }
    public static void main(String[] args)
    {
        ClassExample.set("kunal", 1234);
        ClassExample.display();
    }
}