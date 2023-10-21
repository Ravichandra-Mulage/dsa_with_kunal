package assignments;

import java.util.Scanner;

public class FactorialMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find out factorial: ");
        int num = sc.nextInt();
        Factorial(num);
    }
    static void Factorial(int num){
        int factorial = 1;
        if(num == 1){
            System.out.println("!1 = 1");
        } else if (num == 0) {
            System.out.println("!0 = 0");
        }
        for (int i = 1; i <= num; i++) {
            factorial *=i;
        }
        System.out.println("The factorial of number "+num+" is = "+factorial);
    }
}
