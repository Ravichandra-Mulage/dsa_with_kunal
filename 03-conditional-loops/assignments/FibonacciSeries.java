package assignments;

import java.util.Scanner;

public class FibonacciSeries {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a Number: ");
            int number = sc.nextInt();

            int firstTerm = 0;
            int secTerm = 1;
            int nextTerm = 0;

            for (int i = 0; i < number; i++) {
                System.out.print (firstTerm+" ");

                nextTerm = firstTerm + secTerm;
                 firstTerm = secTerm;
                 secTerm = nextTerm;
            }

        }
    }

