public class Scope_variables {
    static int x = 10;
    private int y = 50;
    public void method(int x)
    {
        Scope_variables obj = new Scope_variables();
        this.x = 20;
        y = 55;
        System.out.println("Scope_variables.x: "+ Scope_variables.x);
        System.out.println("obj.x: "+ obj.x);
        System.out.println("x: " + x);
        System.out.println("obj.y: "+ obj.y);
        System.out.println("y: "+ y);

    }
    public static void main(String[] args)
    {
        Scope_variables obj = new Scope_variables();
        obj.method(5);
        
    }

}
