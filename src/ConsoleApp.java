import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ConsoleApp
{
    public static void main(String[] args)
    {
        List<Student> journal = new ArrayList<Student>();
        Scanner in = new Scanner(System.in);

        String userChoice;
        do
        {
            System.out.println("It's such a pleasure. How can I help you, human?\nChoose an option: ");
            System.out.println("1.'Add' - add a record");
            System.out.println("2.'Show' - check all the records");
            System.out.println("3.'Quit' - like with a cigarettes");
            userChoice = in.nextLine();
            switch (userChoice)
            {
                case ("Add"):
                {
                    Student newEntry = new Student();
                    newEntry.createRecord();
                    journal.add(newEntry);
                    System.out.println("The record was successfully added!");
                    break;
                }
                case ("Show"):
                {
                    System.out.println("The list of the records at the moment:");
                    WriteRecords(journal);
                    break;
                }
                case ("Quit"):
                {
                    System.out.println("I'll miss you, human!");
                    System.exit(0);
                }
                default:
                {
                    System.out.println("I didn't have such functionality as you thought");
                    break;
                }
            }
        }
        while(!userChoice.equals("Quit"));
    }

    static void WriteRecords(List<Student> journal)
    {
        if (journal.size() == 0)
            System.out.println("No journal entries found");
        else
        {
            for (Student journalEntry : journal)
            {
                journalEntry.writeRecord();
            }
        }
    }
}