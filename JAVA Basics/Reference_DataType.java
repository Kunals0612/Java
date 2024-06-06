import java.util.*;
public class Reference_DataType {
    public static void main(String[] args)
    {
        System.out.println("Reference Data Type");
        int [] a={10,20,30,40,50};
        //Here complete reference of a is copied to b
        // and both point to same memory in Heap
        int [] b = a;
        System.out.println("Initially: ");
        System.out.println("Array a: "+ Arrays.toString(a));
        System.out.println("Array b: "+ Arrays.toString(b));
       
        b[1] = 70;
        System.out.println("After Changing: ");
        // array a is also changed due to reference data type;
        System.out.println("Array a: "+ Arrays.toString(a));
        System.out.println("Array b: "+ Arrays.toString(b));
    }
}
