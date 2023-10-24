package assignments.intermediate;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Electricity in Unit: ");
        int unit = sc.nextInt();
        int totalEBill;
        int additionalUnit;
        int hunUnit = 100 * 10;
        int twoHunUnit = 100 * 15;
        int ThreeHunUnit = 100 * 20;

       if(unit >= 1 && unit <=100){
         totalEBill =  unit * 10;
           System.out.println("Your Electricity Bill is: "+totalEBill);
       } else if (unit >=100 && unit <=200) {
           additionalUnit = unit - 100;
           int belowTwoHunUnit = additionalUnit * 15;
           totalEBill = belowTwoHunUnit + hunUnit;
           System.out.println("Your Electricity Bill is: "+totalEBill);
       } else if (unit >=200 && unit <=300) {
           additionalUnit = unit - 200;
           int belowThreeHunUnit = additionalUnit * 20;
           totalEBill = belowThreeHunUnit + hunUnit + twoHunUnit;
           System.out.println("Your Electricity Bill is: "+totalEBill);
       } else {
           additionalUnit = unit - 300;
           int AboveThreeHunUnit = additionalUnit * 25;
           totalEBill = AboveThreeHunUnit + hunUnit + twoHunUnit + ThreeHunUnit;
           System.out.println("Your Electricity Bill is: "+totalEBill);
    }
    }
}
