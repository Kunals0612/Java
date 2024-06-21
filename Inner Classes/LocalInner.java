class Outer1{
    public void display()
    {
        class Inner1{
            public void show()
            {
                System.out.println("Hellooo");
            }
        }
        Inner1 i = new Inner1();
        i.show();
        new Inner1().show();
    }
}
public class LocalInner {
    public static void main(String[] args)
    {
        Outer1 o = new Outer1();
        o.display();
    }
}
