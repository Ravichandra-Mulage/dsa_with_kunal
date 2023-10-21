package assignments;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        float r = sc.nextFloat();
        areaAndCircumOfCirle(r);
    }
    static void areaAndCircumOfCirle(float radius){
        float pi = 3.14f;
        float areaOfCircle = pi * radius * radius;
        float circumferenceOfCircle = 2 * pi * radius;
        System.out.println(areaOfCircle);
        System.out.println(circumferenceOfCircle);
    }

}
