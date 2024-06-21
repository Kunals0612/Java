interface Test1{  //You can not edit inteface later on
   int X = 10; // Try to use upparcase for identifiers in intefaces; You can make it as static as well as final 
   void method1(); //By default methods are abstract and public;
   void method2(); //can not make abstract method as private they are supposed to be override;
//    void method3()
//    {
          //Interfaces does not consists the concrete methods to define method as concrete then you need to define it as static
//    }
      default void method3() // according to new vesion of java default methods are also available in intefaces just define it with keyword default;
      {
          System.out.println("concrete method 3 called");
      }
}
interface Test2 extends Test1{
    public void method4();
}
class My1 implements Test2{
    public void method1(){}
    public void method2(){}
    public void method4(){}
}
public class DosandDonts {
    public static void main(String[] args)
    {
        System.out.println(Test1.X);
        My1 m = new My1();
        m.method3();
    }
}
