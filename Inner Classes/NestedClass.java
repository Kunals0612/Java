class Outer{
    int x = 10;
    Inner i = new Inner(); // You can also define object here
    class Inner{
        int y = 20;
        void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    void outerDisplay()
    {
        System.out.println("Hellooo");
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}
public class NestedClass{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.outerDisplay();   
        Outer.Inner oi = new Outer().new Inner();  //.class file will get save as outer$inner.class
        oi.innerDisplay();
    }
}