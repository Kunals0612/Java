import java.util.*;
public class Wrapper_class {
    public static void main(String[]args)
    {
        char ch = 'a';
        // Auto-boxing primitive to Character object
        Character a = ch;
        System.out.println(a);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);

        System.out.println(arrayList.get(0));


        Character c = 'a';
        //un-boxing Character object to primitive
        char b = c;
        System.out.println(b);
    }
}
