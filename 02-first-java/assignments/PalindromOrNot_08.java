package assignments;

import java.util.Scanner;

public class PalindromOrNot_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrom or not: ");
        int num = sc.nextInt();
        int remainder;
        int temp = num;
        int sum = 0;
        while(num>0){
            remainder = num % 10;
            sum = (sum * 10) + remainder;
            num = num / 10;
        }
        if(temp == sum){
            System.out.println("The number " +temp+ " is palindrom.");
        } else{
            System.out.println("The number " +temp+ " is not palindrom.");
        }

    }
}
