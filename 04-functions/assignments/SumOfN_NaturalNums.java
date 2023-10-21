package assignments;

import java.util.Scanner;

public class SumOfN_NaturalNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        sumOfNaturalNums(x);
    }
    static void sumOfNaturalNums (int num){
        int sum =0;
        for (int i = 0; i <=num; i++) {
            sum +=i;
        }
        System.out.printf("The sum of %d natural numbers: ",num);
     //   System.out.println();
        System.out.println(sum);

    }
}
