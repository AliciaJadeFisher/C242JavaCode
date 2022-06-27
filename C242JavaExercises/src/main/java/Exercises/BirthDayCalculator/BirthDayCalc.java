package Exercises.BirthDayCalculator;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BirthDayCalc
{
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    static LocalDate current = LocalDate.now();

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Magical Birthday Calculator!");
        LocalDate birthdate = getBirthdate();
        LocalDate thisYear = getThisYear(birthdate);
        LocalDate nextBirthday = getNextBirthday(thisYear);

        System.out.println("This means you were born on a " + birthdate.getDayOfWeek().toString().toUpperCase() + "!");
        System.out.println("This year it falls on a " + thisYear.getDayOfWeek().toString().toUpperCase()  + "!");

        int daysUntil = getDaysUntil(nextBirthday);

        if(daysUntil == 0)
        {
            System.out.println("Today is " + current + " which means it's your birthday today! HAPPY BIRTHDAY!!");
        }
        else
        {
            System.out.println("And since today is " + current + ", there's only " + getDaysUntil(nextBirthday) + " more days until the next one!");
        }

        System.out.println("Bet your excited to be turning " + getAge(birthdate, nextBirthday) + "!");

    }

    public static int getAge(LocalDate birthdate, LocalDate nextBirthday)
    {
        Period diff = birthdate.until(nextBirthday);
        return diff.getYears();
    }

    public static int getDaysUntil(LocalDate nextBirthday)
    {
        return (int) current.datesUntil(nextBirthday).count();
    }
    public static LocalDate getNextBirthday(LocalDate thisYear)
    {
        int dateComp = thisYear.compareTo(current);

        if(dateComp < 0)
        {
            thisYear = thisYear.plusYears(1);
        }

        System.out.println(thisYear);
        return thisYear;
    }
    public static LocalDate getThisYear(LocalDate date)
    {
        LocalDate formattedDate;
        String sMonth = "";
        int month = date.getMonthValue();
        if (month < 10)
        {
            sMonth = "0" + String.valueOf(month);
        } else
        {
            sMonth = String.valueOf(month);
        }

        String current = date.getDayOfMonth() + "-" + sMonth + "-" + LocalDate.now().getYear();
        return formattedDate = LocalDate.parse(current, formatter);

    }

    public static LocalDate getBirthdate()
    {
        System.out.print("What is your birthday? (DD-MM-YYYY): ");
        Scanner input = new Scanner(System.in);

        while(true)
        {
            try
            {
                String dateStr = input.nextLine();
                return LocalDate.parse(dateStr,formatter);
            } catch (DateTimeParseException e)
            {
                System.out.print("Please enter a valid date (DD-MM-YYYY): ");
            }
        }
    }
}
