package assignments;

import java.util.Scanner;

public class UserInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums;
        int add = 0;
        System.out.println("Enter numbers: ");

        do{
            nums = sc.nextInt();
            add=nums+add;
        } while (nums != 0);

                System.out.print("The addition of all the numbers: "+add);

        }
    }
