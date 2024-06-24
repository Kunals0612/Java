public class FinallyDemo2 {
    static void meth1() throws Exception
    {
        try
        {
            throw new Exception();
        }
        finally
        {
            System.out.println("Final block executed");
        }
    }
    public static void main(String[] args) throws Exception
    {
        meth1();
    }
}
