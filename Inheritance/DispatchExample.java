class Superclass{
    public void m1()
    {
        System.out.println("M1");
    }
    public void m2()
    {
        System.out.println("Super M1");
    }
}
class Subclass extends Superclass{
    public void m2()
    {
        System.out.println("Sub M1");
    }
    public void m3()
    {
        System.out.println("M3");
    }
}
public class DispatchExample {
    public static void main(String[] args)
    {
        Superclass su = new Subclass(); // su -> object of subclass
        //Subclass sb = new Superclass not allowed  
        su.m1();
        su.m2(); //output is sub M1 as first m2 method has been shadowed for object su 
        //su.m3(); //Not allowed as Superclass reference su can call only those method defined in Superclass.
        // It can not call the methods which are unique for subclass
    }
}
