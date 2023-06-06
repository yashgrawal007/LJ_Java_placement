import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        

        System.out.print("Enter marks for subject A: ");

        int a = input.nextInt();

        

        System.out.print("Enter marks for subject B: ");

        int b = input.nextInt();

        

        System.out.print("Enter marks for subject C: ");

        int c = input.nextInt();

        

        System.out.print("Enter marks for subject D: ");

        int d = input.nextInt();

        

        int total = a + b + c + d;

        double average = total / 4.0;

        

        System.out.println("Total marks: " + total);

        System.out.println("Average marks: " + average);

        

        if (average >= 90) {

            System.out.println("Grade: A");

        } else if (average >= 80 && average < 90) {

            System.out.println("Grade: B");

        } else if (average >= 70 && average < 80) {

            System.out.println("Grade: C");

        } else {

            System.out.println("Fail");

        }

    }

}
