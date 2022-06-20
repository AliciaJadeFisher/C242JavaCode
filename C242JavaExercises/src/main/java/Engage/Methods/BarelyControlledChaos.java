package Engage.Methods;

import java.util.Random;

public class BarelyControlledChaos
{
    public static void main(String[] args) {

        String color = getColour(); // call color method here
        String animal = getAnimal(); // call animal method again here
        String colorAgain = getColour(); // call color method again here
        int weight = getNumber(5, 200); // call number method, with a range between 5 - 200
        int distance = getNumber(10, 20); // call number method, with a range between 10 - 20
        int number = getNumber(1000, 20000); // call number method, with a range between 10000 - 20000
        int time = getNumber(2, 6); // call number method, with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String getColour()
    {
        Random random = new Random();
        int num = random.nextInt(5);
        String colour;

        switch (num)
        {
            case 0:
                colour = "blue";
                break;
            case 1:
                colour = "red";
                break;
            case 2:
                colour = "green";
                break;
            case 3:
                colour = "yellow";
                break;
            case 4:
                colour = "purple";
                break;
            default:
                colour =  "white";
        }

        return colour;
    }

    public static String getAnimal()
    {
        Random random = new Random();
        int num = random.nextInt(5);
        String animal;

        switch (num)
        {
            case 0:
                animal = "snake";
                break;
            case 1:
                animal = "dog";
                break;
            case 2:
                animal = "bear";
                break;
            case 3:
                animal = "cat";
                break;
            case 4:
                animal = "deer";
                break;
            default:
                animal =  "dragon";
        }

        return animal;
    }

    public static int getNumber(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(min, max+1);
    }
}
