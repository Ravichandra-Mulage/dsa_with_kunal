package assignments.intermediate;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter point 1: ");
        int x1 = sc.nextInt();

        System.out.println("Enter point 2: ");
        int y1 = sc.nextInt();

        System.out.println("Enter point 3: ");
        int x2 = sc.nextInt();

        System.out.println("Enter point 4");
        int y2 = sc.nextInt();

    //   double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        double distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));


        System.out.println("The distance between two points are: "+distance);


    }
}

/*

    Calculate distance between two points
d=√((x2 – x1)² + (y2 – y1)²)
 */
