class Test{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c) //if return type is double with parameters 2 then it will consider duplicate even after return type is double
    {
        return a+b+c;
    }
}
public class Overloading {
    public static void main(String[] args)
    {
        Test t = new Test();
        System.out.println(t.add(10,5));
        System.out.println(t.add(10,5,7));
    }
}
