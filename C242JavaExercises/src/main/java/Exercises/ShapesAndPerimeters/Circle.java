package Exercises.ShapesAndPerimeters;

public class Circle extends Shape
{
    double radius;
    double pi = 3.142;

    public Circle(double r, String c)
    {
        this.radius = r;
        super.setColour(c);
    }

    @Override
    double getArea()
    {
        return pi * (radius * radius);
    }

    @Override
    double getPerimeter()
    {
        return 2 * pi * radius;
    }
}
