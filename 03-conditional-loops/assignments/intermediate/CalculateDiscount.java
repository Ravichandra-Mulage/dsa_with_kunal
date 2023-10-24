package assignments.intermediate;

import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of product: ");
        double markedPrice = sc.nextDouble();

        System.out.println("Enter the discount percentage of the product: ");
        double discountPercent = sc.nextDouble();

        double discountPrice = markedPrice * (discountPercent/100);

        double priceAfterDiscount = markedPrice - discountPrice ;

        System.out.println("The price after discount is: "+priceAfterDiscount);
    }
}

/*
Here is the formula to calculate the discount:

Discount = List price x Discount Rate

For example :

A pen costs 50$, it has been sold at a discount of 12%, what is the discount price of the pen?

A: = 50 x 12/100

= 50 × 0.12

= $ 6
 */