import java.util.Scanner;

public class ExamMarks2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter marks for Assignment 1: ");
        int asgnmt1 = scanner.nextInt();

        System.out.println("Enter marks for Assignment 2: ");
        int asgnmt2 = scanner.nextInt();

        System.out.println("Enter marks for CAT 1: ");
        int cat1 = scanner.nextInt();

        System.out.println("Enter marks for CAT 2: ");
        int cat2 = scanner.nextInt();


        double average = (asgnmt1 + asgnmt2 + cat1 + cat2) / 4.0;


        String grade;
        String result;

        if (average >= 93 && average <= 100) {
            grade = "A";
            result = "Pass";
        } else if (average >= 85 && average <=92) {
            grade = "B";
            result = "Pass";
        } else if (average >=80 && average <=84) {
            grade = "C";
            result = "Pass";
        } else if (average >= 75 && average <=79) {
            grade = "D";
            result = "Pass";
        } else {
            grade = "Fail";
            result = "Fail";
        }


        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);


        scanner.close();
    }
}