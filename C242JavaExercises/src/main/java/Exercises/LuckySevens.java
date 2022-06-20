package Exercises;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens
{
    public static void main(String[] args)
    {
        // Initialize variables and Scanner
        int rolls = 0;
        int maxRolls = 0;
        int dollars, maxDollars;
        boolean broke = false;
        Scanner input = new Scanner(System.in);

        // Get the amount of dollars from the user
        System.out.print("How many dollars do you have? : ");
        while(true)
        {
            try
            {
                dollars = Integer.parseInt(input.nextLine());
                maxDollars = dollars;
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Invalid entry, please enter a number: ");
            }
        }

        // Loop for each dice roll
        do
        {
            boolean won = rollDice();
            rolls++;

            // Check if the user won or lost money
            if(won)
            {
                dollars +=4;
            }
            else
            {
                dollars -= 1;
            }

            // Checks if the current dollar amount is greater thant the stored max dollors
            if(dollars > maxDollars)
            {
                maxDollars = dollars;
                maxRolls = rolls;
            }

            // Checks if the user is broke
            if(dollars < 0)
            {
                broke = true;
            }

        } while(!broke);

        // Displays result
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + maxRolls + " rolls when you had $" + maxDollars + ".");
    }

    /**
     * Method which rolls two dice
     * @return if the dice sum is 7 or not
     */
    public static boolean rollDice()
    {
        Random random = new Random();
        int d1 = random.nextInt(1,7);
        int d2 = random.nextInt(1,7);

        if(d1 + d2 == 7)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}