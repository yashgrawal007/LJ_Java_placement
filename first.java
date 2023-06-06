import java.util.Scanner;

public class ATMProgram {

    private static double balance = 1000.0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");

        System.out.println("Your current balance is: $" + balance);

        while (true) {

            System.out.println("\nPlease select an option:");

            System.out.println("1. Withdraw money");

            System.out.println("2. Deposit money");

            System.out.println("3. Exit");

            int option = scanner.nextInt();

            switch (option) {

                case 1:

                    withdrawMoney(scanner);

                    break;

                case 2:

                    depositMoney(scanner);

                    break;

                case 3:

                    System.out.println("Thank you for using the ATM. Goodbye!");

                    System.exit(0);

                default:

                    System.out.println("Invalid option. Please try again.");

            }

        }

    }

    private static void withdrawMoney(Scanner scanner) {

        System.out.print("\nEnter the amount to withdraw: $");

        double amount = scanner.nextDouble();

        if (amount > balance) {

            System.out.println("Insufficient balance. You cannot withdraw more than your current balance.");

        } else if (amount < 0) {

            System.out.println("Invalid amount. Please enter a positive value.");

        } else if (balance - amount < 1000) {

            System.out.println("Minimum balance limit reached. You cannot withdraw this amount.");

        } else {

            balance -= amount;

            System.out.println("Withdrawal successful. Your new balance is: $" + balance);

        }

    }

    private static void depositMoney(Scanner scanner) {

        System.out.print("\nEnter the amount to deposit: $");

        double amount = scanner.nextDouble();

        if (amount < 0) {

            System.out.println("Invalid amount. Please enter a positive value.");

        } else {

            balance += amount;

            System.out.println("Deposit successful. Your new balance is: $" + balance);

        }

    }

}
