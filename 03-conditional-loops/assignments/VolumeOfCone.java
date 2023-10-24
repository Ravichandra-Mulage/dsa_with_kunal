package assignments;

import java.util.Scanner;

public class VolumeOfCone {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter radius: ");

            float radius = sc.nextFloat();

            System.out.println("Enter height: ");

            float pi = 3.14f;

            float height = sc.nextFloat();

            float volumeOfCone = pi * (float) Math.pow(radius,2) * (height/3);

            System.out.println("The Volume Of Cone is: "+ volumeOfCone );

        }
    }

