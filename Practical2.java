public class Practical2 {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        //Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("Addition =" + (a+b));
        System.out.println("Subtraction =" + (a-b));
        System.out.println("Multiplication =" + (a*b));
        System.out.println("Division =" + (a/b));
        System.out.println("Modulus =" + (a%b));
        System.out.println();

        //Relational Operators
        System.out.println("Relational Operators");
        System.out.println("a==b: " + (a==b));
        System.out.println("a!=b: " + (a!=b));
        System.out.println("a>b: " + (a>b));
        System.out.println("a<b: " + (a<b));
        System.out.println("a>=b: " + (a>=b));
        System.out.println("a<=b: " + (a<=b));
        System.out.println();

        //Logical Operators
        boolean x=true;
        boolean y=false;

        System.out.println("Logical Operators");
        System.out.println("x&&y= " + (x&&y));
        System.out.println("x||y= " + (x||y));
        System.out.println("!x= " + (!x));
        System.out.println();

        //Unary Operators
        int c=10;

        System.out.println("Unary Opperators");
        System.out.println("Original Value=" +c);
        System.out.println("Unary Plus=" + (+c));
        System.out.println("Unary Minus=" + (-c));

        System.out.println("Pre increment=" + (++c));
        System.out.println("Post increment=" + (c++));
        System.out.println("After Post increment=" + c);

        System.out.println("Pre Decrement=" + (--c));
        System.out.println("Post Decrement=" + (c--));
        System.out.println("After Pre Decrement=" + c);

        System.out.println();

        //Bitwise Operators
        int p=5;
        int q=3;

        System.out.println("Bitwise Operators");
        System.out.println("p & q=" + (p&q));
        System.out.println("p | q=" + (p|q));
        System.out.println("p ^ q=" + (p^q));
        System.out.println("~p =" + (~p));
        System.out.println("p << 1=" + (p<<1));
        System.out.println("p >> 1=" + (p>>1));

    }
    
}
