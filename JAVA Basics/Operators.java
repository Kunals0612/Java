public class Operators {
    public static void main(String[] args) {
        // arithematic Opeartors;
        int a = 10;
        int b = 5;
        System.out.println("Arithmatic Operators");
        System.out.println("a+b : " + (a + b));
        System.out.println("a-b : " + (a - b));
        System.out.println("a*b : " + (a * b));
        System.out.println("a/b : " + (a / b));

        // unary Operators;
        System.out.println("Unary Operators");
        System.out.println("a++: " + (a++));
        System.out.println("++a: " + (++a));
        System.out.println("b--: " + (b--));
        System.out.println("--b: " + (--b));

        // assignment operators;

        int f = 7;
        System.out.println("Assignment Operators");
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 1: " + (f -= 1));
        System.out.println("f*=2: " + (f *= 2));
        System.out.println("f/=1: " + (f /= 1));
        System.out.println("f&=0b1010: " + (f &= 0b1010));
        System.out.println("f|=0b1010: " + (f |= 0b1010));
        System.out.println("f^=0b1010: " + (f ^= 0b1010));
        System.out.println("f<<=2: " + (f<<=2));
        System.out.println("f>>=2: " + (f>>=2));
        System.out.println("f>>>=2: " + (f>>>=2));
        
        int x = 10;
        int y = 5;
        int z = 4;
        System.out.println("Relational Operators");
        System.out.println("x<y: "+ (x<y));
        System.out.println("x>y: "+ (x>y));
        System.out.println("x<=y: "+ (x<=y));
        System.out.println("x>=y: "+ (x>=y));
        System.out.println("x==z: "+ (x==z));
        System.out.println("x!=z: "+ (x!=z));

        boolean p = true;
        boolean q = false;
        System.out.println("Logical Operators");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));

        System.out.println("Ternary Operator: ");
        int k = 20;
        int l = 30;
        int m = 70;
        int result;
        result = ((k>l) ? (k>m) ? k : m : (l > m) ? l : m);

        System.out.println("Result is: "+result);

        System.out.println("Bitwise Operator: ");
        int d = 0b1010;
        int e = 0b1100;
        System.out.println("d & e: " + (d & e));
        System.out.println("d | e: " + (d | e));
        System.out.println("d ^ e: " + (d ^ e));
        System.out.println("~d: " + (~d));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));


        System.out.println("InstanceOf Operator: ");
        Person obj1 = new Person();
        Person obj2 = new Boy();

        System.out.println("obj1 instanceof Person: "
                           + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: "
                           + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "
                           + (obj1 instanceof MyInterface));


        System.out.println("obj2 instanceof Person: "
                           + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "
                           + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "
                           + (obj2 instanceof MyInterface));

    }
}
class Person{

}
class Boy extends Person implements MyInterface {

}
interface MyInterface{

}