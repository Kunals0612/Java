class Super{
    int x = 10;
    static int y = 20;
    static class My{
        public void show()
        {
            System.out.println(y);
            //System.out.println(x); cannot access non static member in static class;
        }
    }
}

public class StaticExample {
    public static void main(String[] args)
    {
        Super.My m = new Super.My();
        m.show();
    }
}
