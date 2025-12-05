class Calculator
{
    //write functions for addition, subtraction, multiplication and division
    int add(int a, int b)
    {
        return a + b;

    }
    double add(double a, double b)
    {
        return a + b;

    }
    int sub(int a, int b)
    {
        return a - b;

    }
    int mult(int a, int b)
    {
        return a * b;

    }
    int mult(int a, int b, int c)
    {
        return a * b * c;
    }
    int divide(int a, int b)
    {
        return a / b;

    }
    // method override - example of polymorphism
    double divide(double a, double b)
    {
        return a / b;

    }
    int mod(int a, int b)
    {
        return a % b;

    }
}



public class Math1 
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        System.out.println(calc.add(6, 7));
        System.out.println(calc.add(3.2, 4.8));
        System.out.println(calc.sub(6, 7));
        System.out.println(calc.mult(6, 7));
        System.out.println(calc.mult(6, 7, 2));

        System.out.println(calc.divide(6, 7));
        System.out.println(calc.divide(4.5, 1.5));
        System.out.println(calc.mod(6, 7));
        
    }
    
}
