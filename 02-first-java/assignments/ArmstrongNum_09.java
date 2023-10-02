package assignments;
import java.util.Scanner;
public class ArmstrongNum_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check palindrome or not: ");

      


     int number = sc.nextInt();
        int originalNumber, remainder, result = 0, n;

        originalNumber = number;

        for (n=0;originalNumber != 0; ++n){
            originalNumber /= 10;
        }

        originalNumber = number;

        while(originalNumber != 0) 
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

        
    }
}


/*
 
// To find out number of digits in number.
 for (n=0;originalNumber != 0; ++n){
            originalNumber /= 10;
        }


// To check if number is palindrome or not.
 while(originalNumber != 0) 
    {
        remainder = originalNumber % 10;
        result += Math.pow(remainder, n);
        originalNumber /= 10;
     }


 */