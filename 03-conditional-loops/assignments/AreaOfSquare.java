package assignments;

import java.util.Scanner;

public class AreaOfSquare{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side: ");
        int s = sc.nextInt();

        float areaOfSquare = s * s;

        System.out.println("Area of Square is: "+areaOfSquare);
    }
}


