class Base{
    Base()
    {
        System.out.println("Base Called");
    }
}
class Derived extends Base{
    Derived()
    {
        System.out.println("Derived Called");
    }
}
public class Inheritance {
    public static void main(String[] args)
    {
        Derived d = new Derived();
    }
}
