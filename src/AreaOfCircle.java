public class AreaOfCircle
{
    static AreaOfCircle areaofcircle = new AreaOfCircle(); // object declaration
    //global static/class variable declaration
    static double pi = 3.14;
    static double area;

    //no return with parameter - instance method
    void aoc(int redios)
    {
        area = pi *redios * redios;
        System.out.println("The area of the circle : " + area);
    }
    //static area of main method
    public static void main(String[] args)
    {
        areaofcircle.aoc(9); // method call using object name
    }
}
