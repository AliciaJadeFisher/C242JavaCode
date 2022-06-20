package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorizer
{
    public static void main(String[] args)
    {
        // Initialize variables
        ArrayList<Integer> factors;
        int number, count;

        // Initialize Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What number would you like to factor?: ");

        // Validate that the user has entered a number
        while(true)
        {
            try
            {
                number = Integer.parseInt(input.nextLine());
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Invalid entry, please enter a number: ");
            }
        }

        // Call the calculation methods
        System.out.println();
        factors = getFactors(number);
        isPerfect(number, factors);
        isPrime(number, factors);
    }

    /**
     * Methods which gets the factors of a given number
     * @param n - number
     * @return factors - list of factors
     */
    public static ArrayList<Integer> getFactors(int n)
    {
        ArrayList<Integer> factors = new ArrayList<>();

        System.out.println("The factors of " + n + " are:");

        // Loops through each number before the number to check if it is a factor
        // If it is, displays it and adds it to the list
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
                factors.add(i);
            }
        }

        // Display factor total
        System.out.println();
        System.out.println(n + " has " + factors.size() +" factors.");
        System.out.println();

        return factors;
    }

    /**
     * Method with works out if a number is perfect
     * @param n - number
     * @param f - factors
     */
    public static void isPerfect(int n, ArrayList<Integer> f)
    {
        int sum = 0;

        // Sums all factors, but not the actual number
        for(Integer i: f)
        {
            if(i != n)
            {
                sum += i;
            }
        }

        // Checks if the sum equals the number or not and displays the result
        if(sum == n)
        {
            System.out.println(n + " is a perfect number.");
        }

        else
        {
            System.out.println(n + " is not a perfect number.");
        }
    }

    /**
     * Method which works out if a number is prime
     * @param n - number
     * @param f - facotrs
     */
    public static void isPrime(int n, ArrayList<Integer> f)
    {
        // Checks is a number is prime and displays the result
        if(f.size() == 2)
        {
            System.out.println(n + " is a prime number.");
        }
        else
        {
            System.out.println(n + " is not a prime number.");
        }
    }
}