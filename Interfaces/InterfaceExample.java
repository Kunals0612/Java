
//In Java, an interface is a reference type similar to a class that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields, constructors, or concrete methods


interface Test{ //inteface is like an abstract class that holds abstract methods and some constants
    void method1();
    void method2();
}
class My implements Test{
    public void method1()
    {
        System.out.println("Method 1 called");
    }
    public void method2() 
    {
        System.out.println("Method 2 called");
    }
}
public class InterfaceExample{
    public static void main(String[] args)
    {
         // Test t = new Test(); Object of intefaces can not be initialized;
         Test t = new My(); // Interfaces is kind of super class for implemented class 
         t.method1();
         t.method2();
    }
}