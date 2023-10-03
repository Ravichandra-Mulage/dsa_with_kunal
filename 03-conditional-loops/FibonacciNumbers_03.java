import java.util.Scanner;

public class FibonacciNumbers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num  = sc.nextInt();
        int firstTerm = 0;
        int secTerm = 1;
        int i = 0;
       while ( i <=num) {
            System.out.print(firstTerm+" ");
            int nextTerm = firstTerm + secTerm;
            firstTerm = secTerm;
            secTerm = nextTerm;
            i++;
        }
    }
    
}
