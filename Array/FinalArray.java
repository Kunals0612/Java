
//n Java, you can use the final keyword to declare an array that cannot be re-assigned to point to a different array. However, note that while the reference to the array is final, the contents of the array can still be modified. Here's an example to illustrate this
public class FinalArray {
    public static void main(String[] args)
    {
        final int[] arr = {1,2,3,4,5};
        arr[0] = 10;
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
