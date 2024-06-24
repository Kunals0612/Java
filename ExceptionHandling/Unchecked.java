class Test{
    void fun1()
    {
        System.out.println(10/0); //Unchecked Exception;
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at Test.fun1(Unchecked.java:4)
        // at Test.fun2(Unchecked.java:8)
        // at Test.fun3(Unchecked.java:12)
        // at Unchecked.main(Unchecked.java:19)
    }
    void fun2()
    {
       fun1();
    }
    void fun3()
    {
        fun2();
    }
}
public class Unchecked {
    public static void main(String[] args)
    {
        Test t = new Test();
        t.fun3();
    }
}
