package Exercises.SimpleCalculator;

public class SimpleCalculator
{
    double result;
    public SimpleCalculator() {}

    public void add(double op1, double op2)
    {
        result = op1 + op2;
        System.out.println(op1 + " + " + op2 + " = " + result);
    }

    public void subtract(double op1, double op2)
    {
        result = op1 - op2;
        System.out.println(op1 + " - " + op2 + " = " + result);
    }

    public void multiply(double op1, double op2)
    {
        result = op1 * op2;
        System.out.println(op1 + " * " + op2 + " = " + result);
    }

    public void divide(double op1, double op2)
    {
        result = op1 / op2;
        System.out.println(op1 + " / " + op2 + " = " + result);
    }


}

