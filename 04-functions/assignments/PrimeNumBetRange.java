package assignments;

import java.util.Scanner;

public class PrimeNumBetRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting index: ");
        int start = sc.nextInt();
        System.out.println("Enter ending index: ");
        int end = sc.nextInt();
        System.out.printf("\nPrime numbers between %d and %d are: ", start, end);
        System.out.println();

        primeNumInRange(start,end);
    }
    static void primeNumInRange(int s, int e) {
        int flag;
        for (int i = s; i <= e; i++) {

            if (i == 1 || i == 0)
                // not prime numbers
                continue;
            flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}


