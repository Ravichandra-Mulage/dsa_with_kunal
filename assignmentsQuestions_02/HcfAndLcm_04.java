package assignmentsQuestions_02;

import java.util.Scanner;

public class HcfAndLcm_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int min = (num1 > num2) ? num2 : num1;
        int gcd = 0;
        for (int i = 1; i < min; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
         System.out.println("The HCF is :" + gcd);
        int lcm = (num1 * num2) / gcd;
        System.out.println("The LCM is :"+lcm);
    }

}
