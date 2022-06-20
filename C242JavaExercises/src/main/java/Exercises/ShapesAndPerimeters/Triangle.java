package Exercises.ShapesAndPerimeters;

public class Triangle extends Shape
{
    double adjacent, base, hypotenuse, height;

    public Triangle(double a, double b, double hy, double he, String co)
    {
        this.adjacent = a;
        this.base = b;
        this.hypotenuse = hy;
        this.height = he;
        super.setColour(co);
    }

    @Override
    double getArea()
    {
        return (base * height) / 2;
    }

    @Override
    double getPerimeter()
    {
        return adjacent + base + hypotenuse;
    }
}
