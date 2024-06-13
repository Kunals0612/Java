class Rectangle{
    int length;
    int breadth;
    Rectangle()
    {
        length = breadth = 1;
    }
    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    double area()
    {
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid()
    {
        height = 1;
    }
    Cuboid(int l, int b, int h)
    {
        super(l,b);
        height = h;
    }
    double volume()
    {
        return area()*height;
    }
}
public class InheritanceExample3 {
    public static void main(String[] args)
    {
        Cuboid c = new Cuboid();
        System.out.println(c.volume()); // output is 1;
        Cuboid c1 = new Cuboid(10,5,8);
        System.out.println(c1.volume()); //output is 400;
    }
}
