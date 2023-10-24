package assignments;

import java.util.Scanner;

public class UserInputLargestNumAmongAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums;
        int largestNum =0;
        System.out.println("Enter the numbers: ");

        do{
            nums = sc.nextInt();
            if(largestNum < nums){
                largestNum = nums;
            }

        } while (nums != 0);
        System.out.println("The largest Number is: "+largestNum);
    }

}
