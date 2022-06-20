package Exercises.UserIO;

import java.util.Scanner;

public class UserIOImpl implements UserIO
{
    Scanner input = new Scanner(System.in);

    @Override
    public void print(String message)
    {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt)
    {
        System.out.print(prompt);
        return input.nextLine();
    }

    @Override
    public int readInt(String prompt)
    {
        System.out.print(prompt);
        int i;
        while(true)
        {
            try
            {
                i = Integer.parseInt(input.nextLine());
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Please enter a number: ");
            }
        }
        return i;
    }

    @Override
    public int readInt(String prompt, int min, int max)
    {
        System.out.print(prompt);
        int i;
        while(true)
        {
            try
            {
                i = Integer.parseInt(input.nextLine());
                if(i >= min && i <= max)
                {
                    break;
                }
            } catch(NumberFormatException e) {}

            System.out.print("Please enter a number between " + min + " and  " + max + ": ");
        }
        return i;
    }

    @Override
    public double readDouble(String prompt)
    {
        System.out.print(prompt);
        double d;
        while(true)
        {
            try
            {
                d = Double.parseDouble(input.nextLine());
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Please enter a number: ");
            }
        }
        return d;
    }

    @Override
    public double readDouble(String prompt, double min, double max)
    {
        System.out.print(prompt);
        double d;
        while(true)
        {
            try
            {
                d = Double.parseDouble(input.nextLine());
                if(d >= min && d <= max)
                {
                    break;
                }
            } catch(NumberFormatException e) {}

            System.out.print("Please enter a number between " + min + " and  " + max + ": ");
        }
        return d;
    }

    @Override
    public float readFloat(String prompt)
    {
        System.out.print(prompt);
        float f;
        while(true)
        {
            try
            {
                f = Float.parseFloat(input.nextLine());
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Please enter a number: ");
            }
        }
        return f;
    }

    @Override
    public float readFloat(String prompt, float min, float max)
    {
        System.out.print(prompt);
        float f;
        while(true)
        {
            try
            {
                f = Float.parseFloat(input.nextLine());
                if(f >= min && f <= max)
                {
                    break;
                }
            } catch(NumberFormatException e) {}

            System.out.print("Please enter a number between " + min + " and  " + max + ": ");
        }
        return f;
    }

    @Override
    public long readLong(String prompt)
    {
        System.out.print(prompt);
        long l;
        while(true)
        {
            try
            {
                l = Long.parseLong(input.nextLine());
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Please enter a number: ");
            }
        }
        return l;
    }

    @Override
    public long readLong(String prompt, long min, long max)
    {
        System.out.print(prompt);
        long l;
        while(true)
        {
            try
            {
                l = Long.parseLong(input.nextLine());
                if(l >= min && l <= max)
                {
                    break;
                }
            } catch(NumberFormatException e) {}

            System.out.print("Please enter a number between " + min + " and  " + max + ": ");
        }
        return l;
    }
}
