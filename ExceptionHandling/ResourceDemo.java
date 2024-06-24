import java.util.*;
import java.io.*;
public class ResourceDemo {
    static FileInputStream fi;

    static void display() throws Exception
    {
        fi = new FileInputStream("Test.txt");
        Scanner sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a+b);
        fi.close();
    }
    public static void main(String[] args) throws Exception
    {
        display();
    }
}
