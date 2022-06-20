package Demos;
import java.util.Scanner;

/**
 * Class with calculates the number at a given position in the Fibonacci Seuqence
 */
public class Fibonacci
{
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args)
    {
        // Get position input
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int i = s.nextInt();

        // Get the result and output it
        long r = getFibNum(i);
        System.out.println("The fibonacci number at position " + i + " is: " + r);
    }

    /**
     * Method which calculates the Fibonacci number
     * @param n - sequence position
     * @return number at specified position
     */
    public static long getFibNum(int n)
    {
        // Declare and initialize variables
        long prev = 1;
        long curr = 1;
        long next = 0;

        // Print out the first to numbers
        System.out.print(prev + " " + curr);

        /**
         * Loop which generates the Fibonacci sequence
         */
        for(int i = 1; i <= n - 2; i++)
        {
            // Adds the previous two numbers together
            next = prev + curr;

            // Prints out the next number
            System.out.print(" " + next);

            // Shifts the sequence for the next loop
            prev = curr;
            curr = next;

        }
        System.out.println(" ");
        return next;
    }
}
