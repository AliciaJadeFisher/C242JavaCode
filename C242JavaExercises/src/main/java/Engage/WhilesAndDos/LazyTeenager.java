package Engage.WhilesAndDos;

import java.util.Random;

public class LazyTeenager
{
    public static void main(String[] args)
    {
        boolean roomClean = false;
        int count = 0;
        int chance = 9;
        int decision;

        Random random = new Random();

        do
        {
            count++;
            System.out.println("Clean your room (x" + count +")");
            decision = random.nextInt(chance);

            if(count > 7)
            {
                System.out.println("THAT'S IT! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            else if(decision == 0)
            {
                System.out.println("FINE! I'LL CLEAN MY ROOM!");
                break;
            }

            chance--;

        } while(!roomClean);
    }
}
