package Practice.Enums;

import java.util.Scanner;

public class MathOperators
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        IntMath math = new IntMath();
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int firstNum = getInt();

        System.out.print("Second number: ");
        int secondNum = getInt();

        System.out.print("Operation (PLUS, MINUS, MULTIPLY, DIVIDE): ");
        OperatorEnum operation = getEnum();

        System.out.println("Result: " + math.calculate(operation, firstNum, secondNum) );

    }

    public static int getInt()
    {
        boolean invalidInput = true;
        int num = 0;
        while (invalidInput) {
            try {
                String strInput = input.nextLine();
                num = Integer.parseInt(strInput);
                invalidInput = false;
            } catch (NumberFormatException e) {
                System.out.print("Input error. Please try again.");
            }
        }
        return num;
    }

    public static OperatorEnum getEnum()
    {
        while(true)
        {
            try
            {
                String strInput = input.nextLine();
                return OperatorEnum.valueOf(strInput.toUpperCase());
            }catch (IllegalArgumentException e)
            {
                System.out.print("Incorrect entry, please enter a valid operation (PLUS, MINUS, MULTIPLY, DIVIDE): ");
            }
        }
    }
}
