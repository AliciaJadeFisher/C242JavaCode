package Exercises;

import java.io.*;
import java.util.*;

public class StateCapitals2
{
    static HashMap<String,String> capitals = new HashMap<>();
    static ArrayList<String> states = new ArrayList<>();

    public static void main(String[] args) throws IOException
    {
        populateMap();
        writeToFile();
        readFromFile();

        System.out.println(states.size() + 1 +" STATES & CAPITALS ARE LOADED");
        System.out.println("=================");
        System.out.println("HERE ARE THE STATES :");

        for (String s : states)
        {
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println();

        playTrivia();
    }

    public static void playTrivia()
    {
        ArrayList<String> guessed = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int rounds;
        int score = 0;
        String state;

        System.out.print("How many state capitals would you like to guess? (1-50): ");
        while(true)
        {
            try
            {
                rounds = Integer.parseInt(input.nextLine());
                if(rounds >= 0 && rounds <= 50)
                {
                    break;
                }
            } catch (NumberFormatException ignored) {}

            System.out.print("Please enter a number between 1 and 50: ");
        }

        System.out.println();

        if(rounds > 0)
        {

            for(int i = 1; i <= rounds; i++)
            {
                System.out.println("ROUND " + i);
                while(true)
                {
                    Random random = new Random();
                    int num = random.nextInt(50);

                    state = states.get(num);
                    if(!guessed.contains(state))
                    {
                        break;
                    }
                }

                System.out.print("WHAT IS THE CAPITAL OF " + state + "?: ");
                String guess = input.nextLine();

                String answer = capitals.get(state);

                if(guess.toLowerCase().equals(answer.toLowerCase()))
                {
                    System.out.println("NICE WORK! " + answer + " IS CORRECT!");
                    score++;
                }
                else
                {
                    System.out.println("INCORRECT. THE CORRECT ANSWER IS " + answer);
                    score--;
                }

                guessed.add(state);
                System.out.println();
            }

            System.out.println("FINAL SCORE: " + score);
        }
        else
        {
            System.out.println("THANK YOU FOR PLAYING!");
        }
    }

    public static void writeToFile() throws IOException
    {
        PrintWriter writer = new PrintWriter(new FileWriter("StateCapitals.txt"));

        for(String s : capitals.keySet())
        {
            writer.println(s + "::" + capitals.get(s));
        }

        writer.flush();
        writer.close();
    }

    public static void readFromFile() throws FileNotFoundException
    {
        Scanner reader = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));

        while(reader.hasNextLine())
        {
            String currentLine = reader.nextLine();
            String[] parts = currentLine.split("::");
            states.add(parts[0]);
        }

        reader.close();

    }

    public static void populateMap()
    {
        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas", "Little Rock");
        capitals.put("California", "Sacramento");
        capitals.put("Colorado", "Denver");
        capitals.put("Connecticut", "Hartford");
        capitals.put("Delaware", "Dover");
        capitals.put("Florida", "Tallahassee");
        capitals.put("Georgia", "Atlanta");
        capitals.put("Hawaii", "Honolulu");
        capitals.put("Idaho", "Boise");
        capitals.put("Illinois", "Springfield");
        capitals.put("Indiana", "Indianapolis");
        capitals.put("Iowa", "Des Moines");
        capitals.put("Kansas", "Topeka");
        capitals.put("Kentucky", "Frankfort");
        capitals.put("Louisiana", "Baton Rouge");
        capitals.put("Maine", "Augusta");
        capitals.put("Maryland", "Annapolis");
        capitals.put("Massachusetts", "Boston");
        capitals.put("Michigan", "Lansing");
        capitals.put("Minnesota", "Saint Paul");
        capitals.put("Mississippi", "Jackson");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Montana", "Helena");
        capitals.put("Nebraska", "Lincoln");
        capitals.put("Nevada", "Carson City");
        capitals.put("New Hampshire", "Concord");
        capitals.put("New Jersey", "Trenton");
        capitals.put("New Mexico", "Santa Fe");
        capitals.put("New York", "Albany");
        capitals.put("North Carolina", "Raleigh");
        capitals.put("North Dakota", "Bismarck");
        capitals.put("Ohio", "Columbus");
        capitals.put("Oklahoma", "Oklahoma City");
        capitals.put("Oregon", "Salem");
        capitals.put("Pennsylvania", "Harrisburg");
        capitals.put("Rhode Island", "Providence");
        capitals.put("South Carolina", "Pierre");
        capitals.put("Tennessee", "Nashville");
        capitals.put("Texas", "Austin");
        capitals.put("Utah", "Salt Lake City");
        capitals.put("Vermont", "Montpelier");
        capitals.put("Virgina", "Richmond");
        capitals.put("Washington", "Olympia");
        capitals.put("West Virgina", "Charleston");
        capitals.put("Wisconsin", "Madison");
        capitals.put("Wyoming", "Cheyenne");
    }
}
