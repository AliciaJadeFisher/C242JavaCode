package Exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class StateCapitals1
{
    static HashMap<String,String> capitals = new HashMap<>();
    public static void main(String[] args)
    {
        populateMap();
        Set<String> states = capitals.keySet();
        Collection<String> cities = capitals.values();

        System.out.println("STATES:");
        System.out.println("==================");

        for(String s : states)
        {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("CAPITALS: ");
        System.out.println("==================");

        for(String c : cities)
        {
            System.out.println(c);
        }

        System.out.println();
        System.out.println("STATE/CAPITAL PAIRS: ");
        System.out.println("==================");

        for(String s : states)
        {
            System.out.println(s + " - " + capitals.get(s));
        }

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
