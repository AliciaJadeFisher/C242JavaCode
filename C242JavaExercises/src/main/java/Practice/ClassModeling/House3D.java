package Practice.ClassModeling;

public class House3D
{
    private double width, height, length;
    private int floors;
    private int rooms;

    public House3D(double width, double height, double length, int floors, int rooms)
    {
        this.width = width;
        this.height = height;
        this.length = length;
        this.floors = floors;
        this.rooms = rooms;
    }

    public double getWidth()
    {
        return width;
    }

    public void updateWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void updateHeight(double height)
    {
        this.height = height;
    }

    public double getLength()
    {
        return length;
    }

    public void updateLength(double length)
    {
        this.length = length;
    }

    public int getFloors()
    {
        return floors;
    }

    public void updateFloors(int floors)
    {
        this.floors = floors;
    }

    public int getRooms()
    {
        return rooms;
    }

    public void updateRooms(int rooms)
    {
        this.rooms = rooms;
    }

    public double calcArea()
    {
        return width * length;
    }

    public double calcVolume()
    {
        return calcArea() * height;
    }
}