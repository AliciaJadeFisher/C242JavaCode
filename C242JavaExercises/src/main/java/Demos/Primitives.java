package Demos;

public class Primitives
{
    public static void main(String[] args)
    {
        primitivesAndWrappers();
        mutability();
    }

    public static void primitivesAndWrappers()
    {
        byte by;
        short s;
        int i = 2000000000;
        long l;

        float f;
        double d;

        char c;
        boolean b;

        i += 1000000000; // overflow
        System.out.println(i);

        Byte by1;
        Short s1;
        Integer i1;
        Long l1;
        Float f1;
        Double d1;
        Character c1;
        Boolean b1;
    }

    public static void mutability()
    {
//        Integer i1 = new Integer(200);
//        int i0 = i1.intValue();

        Integer i1 = 200;
        final Integer i2 = 350; // effectively constant
        int i0 = i1;

        i0 += 50;
        i1 += 123;

        System.out.printf("i0 = %1d, i1 = %2d %n", i0, i1);
        System.out.println("i0 = " + i0 + ", i1 = " + i1);
    }
}