package Exercises.SimpleCalculator;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        SimpleCalculator sc = new SimpleCalculator();
        double op1, op2;
        int choice;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? : ");
        while (true)
        {
            try
            {
                op1 = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e)
            {
                System.out.print("Invalid entry, please enter a number: ");
            }
        }

        System.out.print("What is the sedond number? : ");
        while (true)
        {
            try
            {
                op2 = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e)
            {
                System.out.print("Invalid entry, please enter a number: ");
            }
        }

        // Displays the choices to the user
        System.out.println();
        System.out.println("What operation would you like to perform");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print("Your choice: ");

        // Validates the user's choice
        while (true)
        {
            choice = Integer.parseInt(input.nextLine());

            if (choice < 1 || choice > 4)
            {
                System.out.print("Invalid choice, please choose either 1, 2, 3 or 4: ");
            } else
            {
                break;
            }
        }

        switch (choice)
        {
            case 1:
                sc.add(op1,op2);
                break;
            case 2:
                sc.subtract(op1,op2);
                break;
            case 3:
                sc.multiply(op1,op2);
                break;
            case 4:
                sc.divide(op1,op2);
                break;
        }
    }
}
