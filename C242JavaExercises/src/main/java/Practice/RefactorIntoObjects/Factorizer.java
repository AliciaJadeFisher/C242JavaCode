package Practice.RefactorIntoObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorizer
{
    ArrayList<Integer> factors = new ArrayList<>();
    int number, count;

    public Factorizer(int number)
    {
        this.number = number;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("What number would you like to factor?: ");

        // Validate that the user has entered a number
        while(true)
        {
            try
            {
                n = Integer.parseInt(input.nextLine());
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Invalid entry, please enter a number: ");
            }
        }

        System.out.println();
        Factorizer factorizer = new Factorizer(n);
        factorizer.getFactors();
        factorizer.isPerfect();
        factorizer.isPrime();
    }

    /**
     * Methods which gets the factors of a given number
     */
    public void getFactors()
    {

        System.out.println("The factors of " + number + " are:");

        // Loops through each number before the number to check if it is a factor
        // If it is, displays it and adds it to the list
        for(int i = 1; i <= number; i++)
        {
            if(number % i == 0)
            {
                System.out.print(i + " ");
                factors.add(i);
            }
        }

        // Display factor total
        System.out.println();
        System.out.println(number + " has " + factors.size() +" factors.");
        System.out.println();
    }

    /**
     * Method with works out if a number is perfect
     */
    public void isPerfect()
    {
        int sum = 0;

        // Sums all factors, but not the actual number
        for(Integer i: factors)
        {
            if(i != number)
            {
                sum += i;
            }
        }

        // Checks if the sum equals the number or not and displays the result
        if(sum == number)
        {
            System.out.println(number + " is a perfect number.");
        }

        else
        {
            System.out.println(number + " is not a perfect number.");
        }
    }

    /**
     * Method which works out if a number is prime
     */
    public void isPrime()
    {
        // Checks is a number is prime and displays the result
        if(factors.size() == 2)
        {
            System.out.println(number + " is a prime number.");
        }
        else
        {
            System.out.println(number + " is not a prime number.");
        }
    }
}
