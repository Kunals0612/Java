class Square{
    int length;
    Square(int length)
    {
       this.length = length; // first length is property of class and second length is parameter if i remove `this` then fist length will act as parameter;
    }
    void display()
    {
        System.out.println("The length is: "+this.length);
    }
}
public class ThisExample {
    public static void main(String[] args)
    {
        Square sq = new Square(10);
        sq.display();
    }
}
