class Super{
    public void display()
    {
        System.out.println("Hello");
    }
}
class Sub extends Super{
    public void display()
    {
        System.out.println("Hello Welcome");
    }
}
public class OverridingExample {
    public static void main(String[] args)
    {
        Super su = new Super();
        su.display();
        Sub sb = new Sub(); //when i've created a sb object then the first display method will get shadowed and display method od sub class will get called
        sb.display();
    }
}
