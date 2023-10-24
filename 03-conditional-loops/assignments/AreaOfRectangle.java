package assignments;

import java.util.Scanner;

public class AreaOfRectangle {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter length: ");
            int l = sc.nextInt();
            System.out.println("Enter width: ");
            int w = sc.nextInt();

            float areaOfRectangle = l * w;

            System.out.println("Area of Rectangle is: "+areaOfRectangle);
        }
    }


