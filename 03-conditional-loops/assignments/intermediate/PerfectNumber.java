package assignments.intermediate;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int perfectNum = 0;

        for (int i = 1; i < num; i++) {

            if(num % i == 0){
                perfectNum +=i;
            }
        }
        if (num == perfectNum){
            System.out.println("The provided num is perfect number.");
        } else {
            System.out.println("The provided num is not a perfect number.");

        }
    }
}
