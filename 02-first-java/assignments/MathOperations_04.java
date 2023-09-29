package assignments;

import java.util.Scanner;

public class MathOperations_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter another number: ");
        int y = sc.nextInt();
        // Consume the newline character left in the input buffer (Remember IMP)
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

// IMP Remember this

/*
 * In Java, when you use `nextInt()`, `nextDouble()`, or similar methods to read
 * data from the standard input using a `Scanner` object,
 * these methods do not consume the newline character (`\n`) that is created
 * when the user presses Enter after providing their input.
 * This newline character is left in the input buffer.
 * 
 * When you subsequently use `nextLine()`, it consumes this newline character,
 * treating it as an empty line.
 * This can lead to unexpected behavior because `nextLine()` would read the
 * empty line and your program might not work as intended.
 * 
 * In your program, after reading the integers `x` and `y`, you use `nextInt()`
 * followed by `nextLine()` to read the operator.
 * Without consuming the newline character before reading the operator,
 * `nextLine()` would immediately read the leftover newline character, resulting
 * in an empty string.
 * 
 * To avoid this issue, you need to add `sc.nextLine()` after reading the
 * integers.
 * This extra `nextLine()` call consumes the leftover newline character and
 * prepares the input stream for the next user input,
 * ensuring that the subsequent `nextLine()` call reads the correct input
 * provided by the user.
 * 
 * 
 */
