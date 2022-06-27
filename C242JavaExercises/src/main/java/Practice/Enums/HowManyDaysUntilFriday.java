package Practice.Enums;

import java.util.Scanner;

public class HowManyDaysUntilFriday
{
    public static void main(String[] args)
    {
        DaysEnum day;
        Scanner input = new Scanner(System.in);
        System.out.print("Day of the Week: ");

        while(true)
        {
            try
            {
                day = DaysEnum.valueOf(input.nextLine().toUpperCase());
                break;
            }catch (IllegalArgumentException e)
            {
                System.out.print("Incorrect entry, please enter a day of the week: ");
            }
        }

        int days;
        switch (day)
        {
            case MONDAY -> days = 4;
            case TUESDAY -> days = 3;
            case WEDNESDAY -> days = 2;
            case THURSDAY -> days = 1;
            case SATURDAY -> days = 5;
            case SUNDAY -> days = 6;
            default -> days = 0;
        }

        if(days == 0)
        {
            System.out.println("It's Friday!");
        }
        else
        {
            System.out.println(days + " until Friday");
        }
    }
}
