public class Calculator
{
    static Calculator cal= new Calculator();
    // static variable declaration
    static int a = 10;
    static int b =20;

    //instance variable declaration
    int c;
    int d;

    static int total;
    //no return type and no parameter - static value
    public static void add()
    {
        total = a+b;
        System.out.println("Total Addition of value " + a +" and" + b +" = " + total);
    }
    public static void sub()
    {
        total = a-b;
        System.out.println("Total Subtraction of value " + a + " and " + b + " = " + total);
    }
    // no return type with parameter value - instance value
    void multi(int c,int d)
    {
        total= c*d;
        System.out.println("Total Multiplication of value " + c + " and " + d + " = " + total);
    }
    void div(int c,int d)
    {
        total= c/d;
        System.out.println("Total Division of value " + c + " and " + d + " = " + total);
    }
    public static void main(String[] args)
    {
        // Calling class
        add();
        sub();
        // Calling class with object and declare instance value
        cal.multi(10,15 );
        cal.div( 20 ,5);
    }
}
