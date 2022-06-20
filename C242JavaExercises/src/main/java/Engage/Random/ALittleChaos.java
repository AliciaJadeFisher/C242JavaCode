package Engage.Random;

import java.util.Random;

public class ALittleChaos
{
    public static void main(String[] args)
    {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));

        // Changing to 51 + 50 acts exactly the same
        // Yes, random numbers can be included in a math statement
        // randomizer.nextInt(400) = 12, 134, 191, 226, 256, 189
        // randomizer.nextInt(1000) = 169, 726, 195, 678, 956, 267

    }
}
