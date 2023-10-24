package assignments;

import java.util.Scanner;

public class PerimeterOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");

        float radius = sc.nextFloat();

        float pi = 3.14f;

        float perimeterOfCircle = 2 *  pi * radius;

        System.out.println("The Perimeter of Circle is: "+ perimeterOfCircle);

    }
}
