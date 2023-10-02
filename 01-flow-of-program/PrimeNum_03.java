
import java.util.Scanner;
class PrimeNum{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int c = 2;
        boolean isPrime = true;
        while(c * c <= num){
            if( num % c == 0){
                isPrime = false;
                break;
            }
            c++;
        }
        if (isPrime) {
            System.out.println("Number is prime.");
        } else{
            System.out.println("Number is not prime." );
        }

    }

}