package assignments;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");

        float redius = sc.nextFloat();

        float pi = 3.14f;

        float areaOfCircle = pi * (float) (Math.pow(redius,2));

        System.out.println("The Area of Circle is: "+areaOfCircle);

    }
}
