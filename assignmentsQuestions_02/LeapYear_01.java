 package assignmentsQuestions_02;
import java.util.Scanner;
public class LeapYear_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("The year is leap year.");
        } else {
            System.out.println("not a leap year");
        }
    }
}
