package Practice.RefactorIntoObjects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestCalculator
{
    int timeFrame;
    double amount,rate;
    String period;

    public InterestCalculator() {}

    public static void main(String[] args)
    {
        InterestCalculator iCalc = new InterestCalculator();
        iCalc.getInputs();
    }

    public void getInputs()
    {
        // Initialize Scanner
        Scanner input = new Scanner(System.in);

        // Gets the amount the user wants to invest and validates it
        System.out.print("How much do you want to invest? : ");
        while(true)
        {
            try
            {
                amount = Double.parseDouble(input.nextLine());
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Invalid entry, please enter a number: ");
            }
        }

        // Gets the number of years the user wants to invest for
        System.out.print("How many years are you investing for? : ");
        while(true)
        {
            try
            {
                timeFrame = Integer.parseInt(input.nextLine());
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Invalid entry, please enter a number: ");
            }
        }

        // Gets the interest rate from the user and validates it
        System.out.print("What is the annual interest rate % growth? : ");
        while(true)
        {
            try
            {
                rate = Double.parseDouble(input.nextLine());
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.print("Invalid entry, please enter a number: ");
            }
        }

        // Gets the period display from the user and validates it
        System.out.print("Would you like to see quarterly, monthly or daily compound periods? (Q,M or D): ");
        while(true)
        {
            period = input.nextLine().toUpperCase();

            if(!period.equals("Q") && !period.equals("M") && !period.equals("D"))
            {
                System.out.print("Invalid entry, please enter one of the following options (Q, M or D): ");
            }
            else
            {
                break;
            }
        }

        System.out.println();
        System.out.println("Calculating...");
        getInvestment();
    }
    /**
     * Method which calculates interest
     */
    public void getInvestment()
    {
        final DecimalFormat df = new DecimalFormat("0.00");
        double total = amount;
        double earned;
        double r = rate /100;

        // Adjusts the time period and rate depending on the period display choice
        if(period.equals("Q"))
        {
            timeFrame *= 4;
            r /= 4;
        }
        else if(period.equals("M"))
        {
            timeFrame *= 12;
            r /= 12;
        }
        else if(period.equals("D"))
        {
            timeFrame *= 365;
            r /= 365;
        }

        // Loops for each time period section and displays the interest earned for that section
        for(int i = 1; i <= timeFrame; i++)
        {
            earned = total * r;
            double newTotal = total + earned;

            switch (period)
            {
                case "Q" -> System.out.println("Quarter " + i + ": ");
                case "M" -> System.out.println("Month " + i + ": ");
                case "D" -> System.out.println("Day " + i + ": ");
            }

            System.out.println("Began with: $" + df.format(total));
            System.out.println("Earned: $" + df.format(earned));
            System.out.println("Ended with: $" + df.format(newTotal));
            System.out.println();

            total = newTotal;
        }
    }
}
