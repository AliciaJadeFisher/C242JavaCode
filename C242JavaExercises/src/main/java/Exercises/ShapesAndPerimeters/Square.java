package Exercises.ShapesAndPerimeters;

public class Square extends Shape
{
    double length;

    public Square(double l, String c)
    {
        this.length = l;
        super.setColour(c);
    }

    @Override
    double getArea()
    {
        return length * length;
    }

    @Override
    double getPerimeter()
    {
        return length * 4;
    }
}
