package assignments;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter another number: ");
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Choose one operator between these [+, -, *, /, %]: ");
        String operator = sc.nextLine();
        if (operator.equals("+")) {
            System.out.println("The addition of numbers are: " + (x + y));
        } else if (operator.equals("-")) {
            System.out.println("The substraction of numbers are: " + (x - y));
        } else if (operator.equals("*")) {
            System.out.println("The multipliccation of numbers are: " + (x * y));

        } else if (operator.equals("/")) {
            System.out.println("The division of numbers are: " + (x / y));

        } else if (operator.equals("%")) {
            System.out.println("The remainder of numbers are: " + (x % y));

        } else {
            System.out.println("Invalid Operator.");
        }

    }

}
