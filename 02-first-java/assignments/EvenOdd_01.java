package assignments;

import java.util.Scanner;

public class EvenOdd_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("The number "+x+" is even.");
        } else{
            System.out.println("The number "+x+" is odd.");
        }
    }
}
