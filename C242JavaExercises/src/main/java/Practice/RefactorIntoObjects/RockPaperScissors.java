package Practice.RefactorIntoObjects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
    int rounds;
    int uScore = 0;
    int cScore = 0;
    int ties = 0;

    String user, computer;

    public RockPaperScissors(){}

    public static void main(String[] args)
    {
        RockPaperScissors rps = new RockPaperScissors();
        rps.play();

    }

    public void play()
    {
        // Initialise Scanner and Random
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("======== Rock, Paper, Scissors ========");

        // Loop which allows the user to play as many games as they would like
        while (true)
        {
            // Get number of rounds for the game
            System.out.print("How many rounds would you like to play? (1-10): ");
            rounds = Integer.parseInt(input.nextLine());

            // Check that the number of rounds are in range, if not exits the program
            if (rounds < 1 || rounds > 10)
            {
                System.out.println("Invalid number of rounds entered.");
                break;
            }

            // For loop for each round
            for (int i = 1; i <= rounds; i++)
            {
                // Displays the choices to the user
                System.out.println();
                System.out.println("What is your choice for this round?");
                System.out.println("1 - Rock");
                System.out.println("2 - Paper");
                System.out.println("3 - Scissors");
                System.out.print("Your choice: ");

                int choice;

                // Validates the user's choice
                while (true)
                {
                    choice = Integer.parseInt(input.nextLine());

                    if (choice < 1 || choice > 3)
                    {
                        System.out.print("Invalid choice, please choose either 1, 2 or 3: ");
                    } else
                    {
                        break;
                    }
                }

                // Gets the string versions of the choices
                user = getChoice(choice);
                computer = getChoice(random.nextInt(1, 4));

                // Displays both choices
                System.out.println("User: " + user);
                System.out.println("Computer: " + computer);

                // Calculates the result of the round
                if (user.equals(computer))
                {
                    System.out.println("It's a tie!");
                    ties++;
                } else
                {
                    boolean result = playerWins();

                    // Displays the result and increments the relevant score counter
                    if (result)
                    {
                        System.out.println("You win!");
                        uScore++;
                    } else
                    {
                        System.out.println("You lose!");
                        cScore++;
                    }
                }
            }

            // Displays the final scores
            System.out.println();
            System.out.println("Your Score: " + uScore);
            System.out.println("Computer Score: " + cScore);
            System.out.println("Tied Rounds: " + ties);

            // Calculates and displays the final result
            if (uScore > cScore)
            {
                System.out.println("You are the winner!");
            } else if (uScore < cScore)
            {
                System.out.println("The computer is the winner!");
            } else
            {
                System.out.println("It was a tie!");
            }

            System.out.println();
            System.out.print("Would you like to play anther game? (Y/N):");
            String again;

            // Validates if the user wants to play again or not
            while (true)
            {
                again = input.next().toUpperCase();
                input.nextLine();

                if (!again.equals("Y") && !again.equals("N"))
                {
                    System.out.print("Invalid entry, please enter either (Y/N): ");
                } else
                {
                    break;
                }
            }

            // Checks if the user wants to play again or not
            if (again.equals("N"))
            {
                System.out.println("=======================================");
                break;
            }
        }
    }

    /**
     * Converts a number choice to its String equivalent
     * @param num - choice
     * @return string version of num
     */
    public String getChoice(int num)
    {
        if(num == 1)
        {
            return "Rock";
        }
        else if(num == 2)
        {
            return "Paper";
        }
        else
        {
            return "Scissors";
        }
    }

    /**
     * Compares the choices to determine the winne#
     * @return boolean determining if the user won
     */
    public  boolean playerWins()
    {
        if (user.equals("Rock"))
        {
            return computer.equals("Scissors");
        }
        else if (user.equals("Paper"))
        {
            return computer.equals("Rock");
        }
        else
        {
            return computer.equals("Paper");
        }
    }
}
