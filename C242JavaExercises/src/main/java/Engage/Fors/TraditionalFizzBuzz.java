package Engage.Fors;

import java.util.Scanner;

public class TraditionalFizzBuzz
{
    public static void main(String[] args)
    {
        int number;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("How many units of fizzing and buzzing do you need in your life?: ");
        number = Integer.parseInt(input.nextLine());

        for(int i = 0; i <= 100; i++)
        {
            boolean inThree = i % 3 == 0;
            boolean inFive = i % 5 == 0;

            if(inThree && inFive && i != 0)
            {
                System.out.println("fizz buzz");
                count++;
            }
            else if (inThree && i != 0)
            {
                System.out.println("fizz");
                count++;
            }
            else if(inFive && i != 0)
            {
                System.out.println("buzz");
                count++;
            }
            else
            {
                System.out.println(i);
            }

            if(count == number)
            {
                break;
            }
        }

        System.out.println("TRADITION!!!");
    }
}
