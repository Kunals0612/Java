import java.util.*;
// import java.io.*;
public class Myscanner{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(str);

        String s = scn.nextLine();
        System.out.println(s);

        int x = scn.nextInt();
        System.out.println(x);

        float f = scn.nextFloat();
        System.out.println(f);
    }
}
