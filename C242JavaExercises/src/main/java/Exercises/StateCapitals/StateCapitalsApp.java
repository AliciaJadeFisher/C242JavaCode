package Exercises.StateCapitals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class StateCapitalsApp
{
    static HashMap<String, Capital> capitals = new HashMap<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        readFromFile();

        System.out.println(capitals.size() + " STATES & CAPITALS ARE LOADED");
        System.out.println("=================");

        for(String s: capitals.keySet())
        {
            Capital capital = capitals.get(s);
            System.out.println(s + " - " + capital.getName() + " | Pop: " + capital.getPopulation() + " | Area: " + capital.getSqMi() + " sq mi");
        }

        filterPopulation();
        filterSquareMileage();
    }

    public static void filterPopulation()
    {
        System.out.println();
        System.out.print("Please enter the lower limit for capital city population: ");
        int pop;

        while(true)
        {
            try
            {
                pop = Integer.parseInt(input.nextLine());
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.print("Please enter a number: ");
            }
        }

        System.out.println();
        System.out.println("LISTING CAPITAL CITIES WITH POPULATIONS GREATER THAN " + pop + ":");
        System.out.println();

        for (String s : capitals.keySet())
        {
            Capital capital = capitals.get(s);

            if(capital.getPopulation() > pop)
            {
                System.out.println(s + " - " + capital.getName() + " | Pop: " + capital.getPopulation() + " | Area: " + capital.getSqMi() + " sq mi");
            }
        }
    }

    public static void filterSquareMileage()
    {
        System.out.println();
        System.out.print("Please enter the upper limit for capital city sq mileage: ");
        double sqMi;

        while(true)
        {
            try
            {
                sqMi = Double.parseDouble(input.nextLine());
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.print("Please enter a number: ");
            }
        }

        System.out.println();
        System.out.println("LISTING CAPITAL CITIES WITH AREAS LESS THAN " + sqMi + ":");
        System.out.println();

        for (String s : capitals.keySet())
        {
            Capital capital = capitals.get(s);

            if(capital.getSqMi() < sqMi)
            {
                System.out.println(s + " - " + capital.getName() + " | Pop: " + capital.getPopulation() + " | Area: " + capital.getSqMi() + " sq mi");
            }
        }
    }

    public static void readFromFile() throws FileNotFoundException
    {
        Scanner reader = new Scanner(new BufferedReader(new FileReader("MoreStateCapitals.txt")));

        while(reader.hasNextLine())
        {
            String currentLine = reader.nextLine();
            String[] parts = currentLine.split("::");
            capitals.put(parts[0], new Capital(parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3])));
        }

        reader.close();
    }



    public static void populateMap()
    {
        capitals.put("Alabama", new Capital("Montgomery", 200603, 159.8));
        capitals.put("Alaska", new Capital("Juneau", 32255, 2716.7));
        capitals.put("Arizona", new Capital("Phoenix", 1608139, 517.6));
        capitals.put("Arkansas", new Capital("Little Rock", 202591, 116.2));
        capitals.put("California", new Capital("Sacramento", 524943, 97.9));
        capitals.put("Colorado", new Capital("Denver", 715522, 153.3));
        capitals.put("Connecticut", new Capital("Hartford", 121054, 17.3));
        capitals.put("Delaware", new Capital("Dover", 39403, 22.4));
        capitals.put("Florida", new Capital("Tallahassee", 196169, 95.7));
        capitals.put("Georgia", new Capital("Atlanta", 198715, 133.5));
        capitals.put("Hawaii", new Capital("Honolulu", 350964, 68.4));
        capitals.put("Idaho", new Capital("Boise", 235684, 63.8));
        capitals.put("Illinois", new Capital("Springfield", 114394, 54.0));
        capitals.put("Indiana", new Capital("Indianapolis", 887642, 361.5));
        capitals.put("Iowa", new Capital("Des Moines", 214133, 75.8));
        capitals.put("Kansas", new Capital("Topeka", 126587, 56.0));
        capitals.put("Kentucky", new Capital("Frankfort", 28602, 14.7));
        capitals.put("Louisiana", new Capital("Baton Rouge", 227470, 76.8));
        capitals.put("Maine", new Capital("Augusta", 18899, 55.4));
        capitals.put("Maryland", new Capital("Annapolis", 40812, 6.73));
        capitals.put("Massachusetts", new Capital("Boston", 675647, 89.6));
        capitals.put("Michigan", new Capital("Lansing", 112644, 35.0));
        capitals.put("Minnesota", new Capital("Saint Paul", 311527, 52.8));
        capitals.put("Mississippi", new Capital("Jackson", 153701, 104.9));
        capitals.put("Missouri", new Capital("Jefferson City", 43228, 27.3));
        capitals.put("Montana", new Capital("Boston", 32091, 14.0));
        capitals.put("Nebraska", new Capital("Lincoln", 291082, 74.6));
        capitals.put("Nevada", new Capital("Carson City", 58639, 143.4));
        capitals.put("New Hampshire", new Capital("Concord", 43976, 64.3));
        capitals.put("New Jersey", new Capital("Trenton", 90871, 7.66));
        capitals.put("New Mexico", new Capital("Santa Fe", 87505, 37.3));
        capitals.put("New York", new Capital("Albany", 99224, 21.4));
        capitals.put("North Carolina", new Capital("Raleigh", 467665, 114.6));
        capitals.put("North Dakota", new Capital("Bismarck", 73622, 26.9));
        capitals.put("Ohio", new Capital("Columbus", 905748, 210.3));
        capitals.put("Oklahoma", new Capital("Oklahoma City", 681054, 620.3));
        capitals.put("Oregon", new Capital("Salem", 175535, 45.7));
        capitals.put("Pennsylvania", new Capital("Harrisburg", 50099, 8.11));
        capitals.put("Rhode Island", new Capital("Providence", 190934, 18.5));
        capitals.put("South Carolina", new Capital("Pierre", 14091, 13.0));
        capitals.put("Tennessee", new Capital("Nashville", 689447, 525.9));
        capitals.put("Texas", new Capital("Austin", 961855, 305.1));
        capitals.put("Utah", new Capital("Salt Lake City", 199723, 109.1));
        capitals.put("Vermont", new Capital("Montpelier", 8074, 10.2));
        capitals.put("Virgina", new Capital("Richmond", 226610, 60.1));
        capitals.put("Washington", new Capital("Olympia", 55605, 16.7));
        capitals.put("West Virgina", new Capital("Charleston", 48864, 31.6));
        capitals.put("Wisconsin", new Capital("Madison", 269840, 68.7));
        capitals.put("Wyoming", new Capital("Cheyenne", 65132, 21.1));
    }
}
