package assignmentsQuestions_02;

import java.util.Scanner;

public class UserInputNumSum_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to calculate their sum. Enter 'x' to finish.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to finish.");
            }
        }

        System.out.println("Sum of entered numbers: " + sum);
        scanner.close();
    }
}
