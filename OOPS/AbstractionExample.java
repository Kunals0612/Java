abstract class A{
    abstract void m1(); //abstract method 
    public void m2() //concrete method
    {
        System.out.println("m2 called");
    }
}
class B extends A{
     void m1()
     {
        System.out.println("m1 called");
     }
}
public class AbstractionExample {
    public static void main(String[] args)
    {
         B b = new B();
         b.m1();
         b.m2();
    }
}
