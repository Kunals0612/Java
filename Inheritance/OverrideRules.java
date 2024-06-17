class Super2{
    public void display() //final and static method can not be overrided  //private method can be derived as private protected and public but public method can not de derived as private
    {
        System.out.println("Super class displayed");
    }
}
class Sub2 extends Super2{
    @Override 
    public void display()  //int display(), void display(int x) are not overrided class
    {
        System.out.println("Sub class displayed");
    }
}
public class OverrideRules {
    public static void main(String[] args)
    {
        Sub2 s = new Sub2();
        s.display();
    }
}
