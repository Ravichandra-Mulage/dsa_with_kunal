package assignments.intermediate;

import java.util.Scanner;

public class AverageOfN_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add: ");
        int totalNumbers = sc.nextInt();
        System.out.println("Enter your numbers: ");
        int nums =0;
        int sum=0;

        for (int i = 0; i < totalNumbers; i++) {
            nums = sc.nextInt();
            sum+=nums;
        }
        System.out.println("The average of two number is: "+sum/totalNumbers);


    }

}
