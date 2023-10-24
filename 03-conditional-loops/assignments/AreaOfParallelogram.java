package assignments;

import java.util.Scanner;

public class AreaOfParallelogram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base: ");
        int b = sc.nextInt();
        System.out.println("Enter height: ");
        int h = sc.nextInt();

        float areaOfParallelogram =  b*h;

        System.out.println("Area of Parallelogram is: "+areaOfParallelogram);
    }
}

