package assignmentsQuestions_02;

import java.util.Scanner;

public class MultiplicationOfNum_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
         System.out.println("Following is the table of "+x);
        for (int i = 1; i <=10; i++) {
           
            System.out.println(x * i);
        }
       

    }
}