import java.util.*;
public class StringTokenizerExample {
    public static void main(String[] args)
    {
        StringTokenizer str = new StringTokenizer("Hello how are you ?");
        int count = str.countTokens();
        System.out.println(count); // output: 5
        while(str.hasMoreTokens())
        {
            System.out.println(str.nextToken());
        }
        int count1 = str.countTokens();
        System.out.println(count1); // output: 0 as nextToken() method consumes all the tokens;
    }
}
