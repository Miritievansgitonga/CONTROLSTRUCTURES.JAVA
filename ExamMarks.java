import java.util.Scanner;

public class ExamMarks{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for Assignment 1: ");
        int asgnmnt1 = input.nextInt();

        System.out.println("Enter marks for Assignment 2: ");
        int asgnmnt2 = input.nextInt();

        System.out.println("Enter marks for CAT 1: ");
        int cat1 = input.nextInt();

        System.out.println("Enter marks for CAT 2: ");
        int cat2 = input.nextInt();


        int average = (asgnmnt1 + asgnmnt2 + cat1 + cat2) / 4;

        char grade;

        if (average >= 40 && average <= 50) {
            grade = 'A';
        } else if (average >= 30 && average <= 39) {
            grade = 'B';
        } else if (average >= 20 && average <= 29) {
            grade = 'C';
        } else if (average >= 10 && average <= 19) {
            grade = 'D';
        } else {
            grade = 'F'; // For fail
        }

        System.out.println("Coursework Average: " + average);
        System.out.println("Grade: " + grade);


        input.close();
    }
}
