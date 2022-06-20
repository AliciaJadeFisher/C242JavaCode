package Exercises.ShapesAndPerimeters;

public class Rectangle extends Shape
{
    double length, width;

    public Rectangle(double l, double w, String c)
    {
        this.length = l;
        this.width = w;
        super.setColour(c);
    }

    @Override
    double getArea()
    {
        return length * width;
    }

    @Override
    double getPerimeter()
    {
        return (length * 2) + (width * 2);
    }
}