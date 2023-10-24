package assignments;

import java.util.Scanner;

public class AreaOfRhombus{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first diagonal: ");
        float d1 = sc.nextFloat();
        System.out.println("Enter second diagonal: ");
        float d2 = sc.nextFloat();

        float areaOfRhombus = ((d1 * d2)/2);

        System.out.println("Area of Rhombus is: "+areaOfRhombus);
    }
}


