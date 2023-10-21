package assignments;
import java.util.Scanner;

public class VotingEligibleOrNotMethod {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        age = sc.nextInt();
        votingEligibility(age);
    }
    static void votingEligibility ( int num){
        if (num >= 18) {
            System.out.println("You are eligible for vote.");
        } else {
            System.out.println("You are not eligible for vote.");
        }
    }

}
