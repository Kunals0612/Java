class Data<T>
{
    private T obj;
    
    public void setData(T v)
    {
        obj = v;
    }
    public T getData()
    {
        return obj;
    }
}
public class GenericClass {
    public static void main(String[] args)
    {
        int a =2;
        if(a == 1)
        {
            Data<Integer> d = new Data<>();
            d.setData(10);
            System.out.println(d.getData());
        }
        else if(a == 2)
        {
            Data<String> d = new Data<>();
            d.setData("Hello");
            System.out.println(d.getData());
        }
    }
}
