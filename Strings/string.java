public class string{
    public static void main(String[] args)
    {
        String str1 = "Hello";
        String str2 = "Hello";

        // These two references point to the same string in the pool
        System.out.println(str1 == str2); // true

        String str3 = new String("Hello");

        // This creates a new String object in heap memory, not in the pool
        System.out.println(str1 == str3); // false

        // Interning the string moves it to the pool if not already present
        String str4 = str3.intern();
        System.out.println(str1 == str4); // true
    }
}