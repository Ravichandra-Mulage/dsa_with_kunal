package assignments;

import java.util.Scanner;

public class SumOfTwoNum_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number ");
        int y = sc.nextInt();
        int c = x + y;
        System.out.println("The addition of both two numbers is: "+c);

    }
}