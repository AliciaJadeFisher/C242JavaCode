package Practice.Fors;

public class ForAndTwentyBlackbirds
{
    public static void main(String[] args) {
        int birdsInPie = 0;
        for (int i = 1; i < 31; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");

        // Changed i to start at 1 not 0
    }
}
