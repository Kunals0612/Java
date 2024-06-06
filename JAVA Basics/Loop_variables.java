public class Loop_variables{
    public static void main(String[] args)
    {
        int x = 10;
        {
            int x = 5; //error as you cant declare same variable twice;
            System.out.println(x);
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(i);
        }
        int i = 10; //No Error as the previously decleared int i scope will get end as soon as the execution of loop gets done;

    }
}