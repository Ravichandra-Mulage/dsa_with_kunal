package assignments;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        evenOrOdd(a);
    }
    static void evenOrOdd(int num){
        if (num % 2==0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

}
