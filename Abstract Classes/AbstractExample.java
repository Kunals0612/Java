abstract class Super{
    public void meth1()
    {
        System.out.println("Method 1 called");
    }
    abstract public void meth2();
}
class Sub extends Super{ //sub class extended from super must contain the defination of abstract method
    public void meth2()
    {
        System.out.println("Method 2 called");
    }
}
public class AbstractExample{
    public static void main(String[] args)
    {
        //Super s = new Super() Error as you can't create the object of abstract class
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
}