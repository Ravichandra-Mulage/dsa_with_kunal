import java.util.Scanner;

public class Reverse_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int num = number;
        int rem; int reverse = 0; 

        for (int i = 0; 0 < number; i++) {
            rem = number % 10;
            // remember this step for reversing a number.
            reverse= (reverse * 10) + rem;
            number = number / 10;
        }
       System.out.println(reverse);
    }
}
