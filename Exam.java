import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int java, Hci, Networking;
        int totalMarks;
        double averageMarks;

        System.out.print("Enter the marks for java: ");
        java = input.nextInt();

        System.out.print("Enter the marks for Hci: ");
        Hci = input.nextInt();

        System.out.print("Enter the marks for Networking: ");
        Networking = input.nextInt();


        totalMarks = java + Hci + Networking ;
        averageMarks = totalMarks / 4.0;
        System.out.println("Average Marks: " + averageMarks);

        if (averageMarks >= 45 && averageMarks <= 50) {
            System.out.println("Grade: A");
        } else if (averageMarks >= 40 && averageMarks <= 44) {
            System.out.println("Grade: B");
        } else if (averageMarks >= 35 && averageMarks <= 39) {
            System.out.println("Grade: C");
        } else if (averageMarks >= 25 && averageMarks <= 34) {
            System.out.println("Grade: D");
        } else if (averageMarks >= 0 && averageMarks <= 24) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
        input.close();
    }
}