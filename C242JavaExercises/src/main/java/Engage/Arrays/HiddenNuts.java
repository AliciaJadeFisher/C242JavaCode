package Engage.Arrays;

import java.util.Random;

public class HiddenNuts
{
    public static void main(String[] args)
    {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        int index = 0;
        for(String i:hidingSpots)
        {
            if(!(i == null))
            {
                System.out.println("Found it! It's in the spot #" + index);
            }

            index++;
        }
    }
}
