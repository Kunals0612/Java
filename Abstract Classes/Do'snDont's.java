abstract class Super1{ //you can not declare abstract class as final and static 
    public void meth1()
    {
        System.out.println("Method1 called");
    }
    abstract void meth2();  //you can not declare abstract method as final and static 
}
class Sub1 extends Super1{
    public void meth2()
    {
        System.out.println("Method2 called");
    }
}
public class Do'snDont's {
    public static void main(String[] args)
    {
        
    }
}
