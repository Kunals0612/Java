public class classExample2 {
    String name;
    int roll_no;

    public classExample2(String s, int rn)
    {
        name = s;
        roll_no = rn;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(roll_no);
    }
    public static void main(String[] args)
    {
        classExample2 obj = new classExample2("Kunal", 123);
        obj.display();
    }
}
