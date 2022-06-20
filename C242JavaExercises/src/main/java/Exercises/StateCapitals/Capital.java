package Exercises.StateCapitals;

public class Capital
{
    private String name;
    private int population;
    private double sqMi;

    public Capital(String n, int p, double s)
    {
        name = n;
        population = p;
        sqMi = s;
    }

    public String getName()
    {
        return name;
    }

    public int getPopulation()
    {
        return population;
    }

    public double getSqMi()
    {
        return sqMi;
    }
}
