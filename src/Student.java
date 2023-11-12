import java.util.Scanner;
import com.google.gson.GsonBuilder;

public class Student
{
    String studentName;
    String studentSurname;
    String studentBirthdayDate;
    String studentPhoneNumber;
    String studentAddress;

    void createRecord()
    {
        Scanner in = new Scanner(System.in);
        boolean ifCorrect = false;

        System.out.print("Please, write a student's name: ");
        do
        {
            String studentName = in.nextLine();
            for (char c : studentName.toCharArray())
            {
                if (Character.isDigit(c))
                {
                    System.out.println("Shit happens..");

                    ifCorrect = false;
                    break;
                }
                this.studentName = studentName;
                ifCorrect = true;
            }
        }
        while(!ifCorrect);
        ifCorrect = false;

        System.out.print("Please, write a student's surname: ");
        do
        {
            String studentSurname = in.nextLine();
            for (char c : studentSurname.toCharArray())
            {
                if (Character.isDigit(c))
                {
                    System.out.println("Shit happens..");

                    ifCorrect = false;
                    break;
                }
                this.studentSurname = studentSurname;
                ifCorrect = true;
            }
        }
        while(!ifCorrect);
        ifCorrect = false;

        System.out.print("Please, write a student's birthday: ");
        do
        {
            String studentBirthdayDate = in.nextLine();
            for (char c : studentBirthdayDate.toCharArray())
            {
                if (Character.isWhitespace(c))
                {
                    System.out.println("Shit happens..");

                    ifCorrect = false;
                    break;
                }
                this.studentBirthdayDate = studentBirthdayDate;
                ifCorrect = true;
            }
        }
        while(!ifCorrect);
        ifCorrect = false;

        System.out.print("Please, write a student's phone number: ");
        do
        {
            String studentPhoneNumber = in.nextLine();
            for (char c : studentPhoneNumber.toCharArray())
            {
                if (Character.isLetter(c) || Character.isWhitespace(c))
                {
                    System.out.println("Shit happens..");

                    ifCorrect = false;
                    break;
                }
                this.studentPhoneNumber = studentPhoneNumber;
                ifCorrect = true;
            }
        }
        while(!ifCorrect);

        System.out.print("Please, write a student's address: ");
        this.studentAddress = in.nextLine();
    }

    void writeRecord()
    {
        GsonBuilder gsonBuilder = new GsonBuilder();
        System.out.println(gsonBuilder.create().toJson(this));
    }
}