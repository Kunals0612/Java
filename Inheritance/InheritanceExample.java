class Circle{
    public double radius; 
    public double area()
    {
        return 3.14*radius*radius;
    } 
    public double perimeter()
    {
        return 2*3.14*radius;
    }
}
class Cylinder extends Circle{
    public double height;
    public double volume()
    {
        return area() * height;
    }
}
public class InheritanceExample{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        c1.radius = 7;
        Cylinder c2 = new Cylinder();
        c2.height = 10;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c2.volume()); // answer is zero as no radius is set for cylinder object
    }
}