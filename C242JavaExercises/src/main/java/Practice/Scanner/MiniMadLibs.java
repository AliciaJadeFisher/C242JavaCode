package Practice.Scanner;

import java.util.Scanner;

public class MiniMadLibs
{
    public static void main(String[] args)
    {
        String noun, adj, noun2, adj2, pluNoun, pluNoun2, pluNoun3, verbPres, verbPast;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Lets play MAD LIBS!");
        System.out.println();

        System.out.print("I need a noun: ");
        noun = input.nextLine();

        System.out.print("Now an adjective: ");
        adj = input.nextLine();

        System.out.print("Another noun: ");
        noun2 = input.nextLine();

        System.out.print("And a number: ");
        number = Integer.parseInt(input.nextLine());

        System.out.print("Another adjective: ");
        adj2 = input.nextLine();

        System.out.print("A plural noun: ");
        pluNoun = input.nextLine();

        System.out.print("Another one: ");
        pluNoun2 = input.nextLine();

        System.out.print("One more: ");
        pluNoun3 = input.nextLine();

        System.out.print("A verb (infinitive form): ");
        verbPres = input.nextLine();

        System.out.print("Same verb (past participle): ");
        verbPast = input.nextLine();

        System.out.println();

        System.out.println(noun + ": the " + adj + " frontier. These are the voyages of the starship " + noun2 + ".");
        System.out.println("Its " + number + "-year mission: to explore strange " + adj2 + " " + pluNoun + ", to seek out " +
                adj2 + " " + pluNoun2 + ", ");
        System.out.println("and " + adj2 + " " + pluNoun3 + ", to boldly " + verbPres + " where no one has " +
                verbPast + " before.");
    }
}
