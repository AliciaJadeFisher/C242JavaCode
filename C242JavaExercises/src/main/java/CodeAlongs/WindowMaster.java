package CodeAlongs;

import java.util.Scanner;

/**
 * Class to calculate the cost of a new window, based on the area and perimeter
 */
public class WindowMaster
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Declare variables
        float height = 0;
        float width = 0;
        float areaCost = 3.50f;
        float perimCost = 2.25f;
        float area, perimeter, cost;
        boolean valid;
        String floatError = "Invalid input. Must be a number.";

        // Get height input from user and validate it
        do
        {
            System.out.print("Please enter the height of the window (in feet): ");
            try{
                height = Float.parseFloat(input.nextLine());
                valid = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println(floatError);
                valid = false;
            }
        } while (!valid);

        // Get width input from user and validate it
        do
        {
            System.out.print("Please enter the width of the window (in feet): ");
            try{
                width = Float.parseFloat(input.nextLine());
                valid = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println(floatError);
                valid = false;
            }
        } while (!valid);

        // Get area and perimeter
        area = calcArea(height,width);
        perimeter = calcPerim(height,width);

        // Calculate cost
        cost = (area * areaCost) + (perimeter * perimCost);

        // Display results to the user
        System.out.println("Height of Window: " + height);
        System.out.println("Width of Window: " + width);
        System.out.println("Area of Window: " + area);
        System.out.println("Perimeter of Window: " + perimeter);
        System.out.println("Total Cost: " + cost);
    }

    /**
     * Method to calculate the area of the window
     * @param h
     * @param w
     * @return area
     */
    public static float calcArea(float h, float w)
    {
        return h * w;
    }

    /**
     * Method to calculate the perimeter of the window
     * @param h
     * @param w
     * @return perimeter
     */
    public static float calcPerim(float h, float w)
    {
        return 2 * (h * w);
    }
}

