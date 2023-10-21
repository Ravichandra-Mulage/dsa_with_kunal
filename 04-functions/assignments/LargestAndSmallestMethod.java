package assignments;
import java.util.Scanner;
public class LargestAndSmallestMethod{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Java program to find largest and smallest of three numbers");
        System.out.println("Please enter first number :");
        int first = scanner.nextInt();
        System.out.println("Please enter second number :");
        int second = scanner.nextInt();
        System.out.println("Please enter third number :");
        int third = scanner.nextInt();
        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, second, third, smallest);
        scanner.close(); }
    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }
    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second; }
        if (third < min) {
            min = third;
        }
        return min;
    }
}

//
//import java.util.Scanner;
//
//public class LargestAndSmallestMethod {
//    public static void main(String[] args) {
//        largestNum();
//        smallestNum();
//    }
//    static void largestNum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter number c: ");
//        int c = sc.nextInt();
//
//        if( a > b && a > c){
//            System.out.println("The number a is largest number.");
//        } else if (b > a && b > c) {
//            System.out.println("The number b is largest number.");
//        } else {
//            System.out.println("The number c is largest number.");
//        }
//    }
//
//    static void smallestNum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter number b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter number c: ");
//        int c = sc.nextInt();
//
//        if( a < b && a < c){
//            System.out.println("The number a is smallest number.");
//        } else if (b < a && b < c) {
//            System.out.println("The number b is smallest number.");
//        } else {
//            System.out.println("The number c is smallest number.");
//        }
//
//    }
//}
//
//
