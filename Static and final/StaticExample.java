class Test{ //Only inner classes can be static;
    static int x = 10;
    int y = 20;
    //non static method can access static as well as non static variables;
    void show()
    {
        System.out.println(x+" "+y);
    }
    //static method can only access static variables;
    static void display()
    {
        System.out.println(x);
    }  
}

public class StaticExample{
    public static void main(String[] args)
    {
         Test t1 = new Test();
         t1.show();
         t1.x = 30; // x value will get change for both object as it is shared by different object of same class;
         t1.y = 20;
         Test t2 = new Test();
         t2.show();
    }
}