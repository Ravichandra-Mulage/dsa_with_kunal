package assignments;

import java.util.Scanner;

public class PalindromeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome: ");
        int number = sc.nextInt();
        isPalindrome(number);
    }
    static void isPalindrome(int num) {
        int sum = 0, rem;
        int originalNum = num;

        while (num != 0 ) {
            rem = num % 10;
            sum = (sum * 10) + rem;
           num /= 10;
        }
        if (originalNum == sum) {
            System.out.println("The number is palindrome.");
        } else {
            System.out.println("The number is not palindrome.");
        }
    }
}
