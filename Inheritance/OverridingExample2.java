class Super1{
    public void display()
    {
        System.out.println("Hello");
    }
}
class Sub1 extends Super1{
    public void display()
    {
        System.out.println("Hello Welcome");
    }
}
public class OverridingExample2 {
    public static void main(String[] args)
    {
        Super1 su = new Sub1(); // remeber one thing methods gets called based on object not by references
        su.display();
    }
}
