import java.util.ArrayList;
import java.util.List;

public class GenericDemo<T> {
    // Using List instead of array
    List<T> data = new ArrayList<>(3);
    
    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo<>();
        gd.data.add("hi");
        gd.data.add("Hello");
        // gd.data.add(10); // This would cause a compile-time error
        
        String str = gd.data.get(0);
        System.out.println(str);
    }
}
