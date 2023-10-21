package assignments;

import java.util.Scanner;

public class ProductOfTwoNumbersMethod {

        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            sc.close();

            sumNum(num1, num2);
        }
        public static void sumNum(int num_A, int num_B) {
            int product = 0;
            product = num_A * num_B;
            System.out.println("Product of two numbers : " + product);

        }
    }
