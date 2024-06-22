class CoffeeMachine{
    private float coffeeQuantity;
    private float milkQuantity;
    private float waterQuantity;
    private float sugarQuantity;
    
    static private CoffeeMachine my = null;

    private CoffeeMachine()
    {
        coffeeQuantity = 1;
        milkQuantity = 1;
        waterQuantity = 1;
        sugarQuantity = 1;
    }
    public void fillWater(float qty)
    {
        waterQuantity = qty;
    }
    public void fillMilk(float qty)
    {
        milkQuantity = qty;
    }
    double getCoffee()
    {
        return 3.5;
    }
    static CoffeeMachine getInstance()
    {
        if(my == null)
        {
           my = new CoffeeMachine();
        }
        return my;
    }

}

public class Singelton {
    public static void main(String[] args)
    {
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();
        System.out.println(m1+" "+m2+" "+m3);
    }
}
