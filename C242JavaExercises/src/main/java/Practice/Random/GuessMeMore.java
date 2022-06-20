package Practice.Random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore
{
    public static void main(String[] args)
    {
        int number;
        int guess;
        String choice;

        Random random = new Random();
        number = random.nextInt(-100,100);

        System.out.println(number);

        Scanner input = new Scanner(System.in);
        System.out.println("I've chosen a number. Can you guess it?");
        while(true)
        {
            System.out.print("Your guess: ");
            guess = Integer.parseInt(input.nextLine());


            if(guess == number)
            {
                System.out.println("Wow, nice guess! That was it!");
                break;
            }
            else
            {
                if(guess < number)
                {
                    System.out.println("Ha, nice try - too low! Try again.");
                }
                else
                {
                    System.out.println("Too bad, way too high. Try again.");
                }

                System.out.print("Do you want to guess again? (y/n) : ");
                choice = input.nextLine();

                if(choice.equals("n"))
                {
                    System.out.println("I chose the number " + number);
                    break;
                }
            }
        }
    }
}
