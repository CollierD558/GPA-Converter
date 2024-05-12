import java.util.Scanner;

public class GPAConverter
{
    public static void main(String[] args)
    {
        System.out.println("This program converts a letter grade to its GPA equivalent.");

        Scanner in = new Scanner(System.in);

        double gpa = 0;
        boolean validGrade = true;

        // Gets letter grade
        System.out.print("Enter letter grade (A, A-, B+, B, B-, C+, C, etc.): ");
        String grade = in.nextLine().toUpperCase();

        // If statements to Assignt GPA score to the letter grade given by user
        if(grade.equals("A"))
        {
            gpa = 4.0;
        }
        else if(grade.equals("A-"))
        {
            gpa = 3.7;
        }
        else if(grade.equals("B+"))
        {
            gpa = 3.3;
        }
        else if(grade.equals("B"))
        {
            gpa = 3.0;
        }
        else if(grade.equals("B-"))
        {
            gpa = 2.7;
        }
        else if(grade.equals("C+"))
        {
            gpa = 2.3;
        }
        else if(grade.equals("C"))
        {
            gpa = 2.0;
        }
        else if(grade.equals("C-"))
        {
            gpa = 1.7;
        }
        else if(grade.equals("D+"))
        {
            gpa = 1.3;
        }
        else if(grade.equals("D"))
        {
            gpa = 1.0;
        }
        else if(grade.equals("D-"))
        {
            gpa = 0.7;
        }
        else if(grade.equals("F"))
        {
            gpa = 0;
        }
        else
        {
            validGrade = false;
        }

        // Prints appropriate GPA, or error message if invalid letter is assigned.
        if(validGrade)
        {
            System.out.println("The GPA for grade " + grade + " is " + gpa);
        }
        else
        {
            System.out.println("Error, invalid letter grade.");
        }

        in.close();
    }
}