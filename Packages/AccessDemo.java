import package1.Myclass;

public class AccessDemo
{
   public static void main(String[] args)
   {
       Myclass m = new Myclass();
       m.display();
       System.out.println(m.a+m.b+m.c+m.d);
   }

}
// AccessDemo.java:9: error: a is not public in Myclass; cannot be accessed from outside package
       // System.out.println(m.a+m.b+m.c+m.d);
                           ^
// AccessDemo.java:9: error: b has private access in Myclass
       // System.out.println(m.a+m.b+m.c+m.d);
                               ^
// AccessDemo.java:9: error: c has protected access in Myclass
       // System.out.println(m.a+m.b+m.c+m.d);