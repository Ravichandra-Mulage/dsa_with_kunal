package assignments;

import java.util.Scanner;

public class AreaOfEquilateralTriangle{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side: ");
        float s = sc.nextFloat();


        float areaOfEquilateralTriangle =  (float) (Math.sqrt(3)/4) * (float) Math.pow(s,2);

        System.out.println("Area of Equilateral Triangle is: "+areaOfEquilateralTriangle);
    }
}

