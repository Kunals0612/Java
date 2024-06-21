class Practice{
    static{
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block 2");
    }
}
public class StaticBlock{
    public static void main(String[] args)
    {
        Practice p = new Practice();
        System.out.println("Main");
    }
}
