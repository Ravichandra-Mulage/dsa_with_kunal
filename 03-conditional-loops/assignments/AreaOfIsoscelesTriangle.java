package assignments;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of equal sides of the isosceles triangle: ");
        double equalSide = scanner.nextDouble();

        System.out.print("Enter the length of the base of the isosceles triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the isosceles triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the isosceles triangle
        double area = (base * height) / 2;

        System.out.println("The area of the isosceles triangle is: " + area);
    }
}
