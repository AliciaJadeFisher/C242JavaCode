package Engage.WhilesAndDos;

public class WaitAWhile
{
    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");

        // bedTime = 11 - another iteration happens
        // timeNow = 11 - does not enter loop, just prints out the two statements at the end
        // timeName++ commented out - infinite loop
    }
}
