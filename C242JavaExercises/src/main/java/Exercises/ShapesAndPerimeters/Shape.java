package Exercises.ShapesAndPerimeters;

public abstract class Shape
{
    private String colour;

    public Shape(){}

    public void setColour(String c)
    {
        this.colour = c;
    }

    abstract double getArea();
    abstract double getPerimeter();
}