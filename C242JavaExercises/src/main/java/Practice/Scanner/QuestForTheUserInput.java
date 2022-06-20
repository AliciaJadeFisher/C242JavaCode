package Practice.Scanner;

import java.util.Scanner;

public class QuestForTheUserInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String yourName, yourQuest;
        double velocityOfSwallow;

        // We can use the Scanner's readLine to assign value to our strings
        // because its return type is string
        System.out.print("What is your name?: ");
        yourName = input.nextLine();
        System.out.print("What is your quest?: ");
        yourQuest = input.nextLine();

        // When we get to our double type, we can use Scanner's nextDouble method
        // or we can use the Double.parseDouble to convert the nextLine's String

        System.out.print("What is the airspeed velocity of an unladen swallow?: ");
        velocityOfSwallow = Double.parseDouble(input.nextLine());
        System.out.println();
        System.out.println("How do you know  " + velocityOfSwallow + " is correct " + yourName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + yourQuest);
    }
}
