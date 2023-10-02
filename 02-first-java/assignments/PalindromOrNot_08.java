package assignments;

import java.util.Scanner;

public class PalindromOrNot_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrom or not: ");
        String num = sc.nextLine();
        int i = 0;
        int j = num.length() - 1;
        int yes = 0;
        char s = num.charAt(i);
        char e = num.charAt(j);
        int compare = Character.compare(s, e);
        // works for both intergers and strings
        while (i < j) {
            if (compare != 0) {
                System.out.println("The number " + num + " is not palindrome.");
                yes = 1;
                break;
            }
            i++;
            j--;

        }
        if (yes == 0) {
            System.out.println("The number " + num + " is palindrome.");
        }

    }
}
