package Practice.RefactorIntoObjects;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens
{
    int rolls = 0;
    int maxRolls = 0;
    int dollars, maxDollars;
    boolean broke = false;

    public LuckySevens(int d)
    {
        dollars = d;
        maxDollars = dollars;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Get the amount of dollars from the user
        System.out.print("How many dollars do you have? : ");
        while(true)
        {
            try
            {
                int dollars = Integer.parseInt(input.nextLine());
                LuckySevens ls = new LuckySevens(dollars);
                ls.play();
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Invalid entry, please enter a number: ");
            }
        }
    }

    public void play()
    {
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
    public boolean rollDice()
    {
        Random random = new Random();
        int d1 = random.nextInt(1,7);
        int d2 = random.nextInt(1,7);

        return d1 + d2 == 7;
    }
}