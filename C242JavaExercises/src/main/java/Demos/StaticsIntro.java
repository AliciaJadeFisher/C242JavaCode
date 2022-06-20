package Demos;

public class StaticsIntro
{
    private int i;
    private double d;
    private static final String s = setVal();

    static
    {
        System.out.println("Initialing StaticIntro class; s= " + s);
    }

    public StaticsIntro()
    {
        i = 1;
        d = 2;
        // s = "c242";
    }

    public int getI()
    {
        return i;
    }

    public void setI(int i)
    {
        this.i = i;
    }

    private static String setVal()
    {
        return "class C242";
    }

    public String doSomething(boolean b)
    {
        int v = i;
        if (b) v+= d;
        return s + " "  +  v;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello from main()");
    }
}
