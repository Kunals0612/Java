public class GenericsDemo {
    public static void main(String[] args)
    {
        Object obj = new String("Hello");   //You can create any type of object with Object class
        String str = (String)obj;   // Before Using the object you need to typecast it into the original Type
        System.out.println(str);

        //Problem 1: No Type Safety
        //Problem 2: Need Type Casting


        Object obje[] = new Object[3];

        obje[0] = "hi";
        obje[1] = "hello";
        obje[2] = new Integer(10);

        String str1;
        for(int i=0; i<3; i++)
        {
            str1 = (String)obje[i];
            System.out.println(str1);
        }
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
        // at GenericsDemo.main(GenericsDemo.java:21)
    }
}
