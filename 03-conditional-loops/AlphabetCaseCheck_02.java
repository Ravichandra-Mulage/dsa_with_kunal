import java.util.Scanner;

public class AlphabetCaseCheck_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet letter:");

        // to remove any extra spaces in the input string
       char ch = sc.next().trim().charAt(0);

        if(ch>= 'a' && ch<='z'){
            System.out.println("The letter is Lowercase");
        } else{
            System.out.println("The letter is Uppercase");
        }
        
    }
    
}



/*
 

class Solution {
    public int subtractProductAndSum(int n) {
        int rem =0
        int productOfDigits = 1;
        int sumOfDigits = 0
        for(int i = 0; 0 < n; i++){
            rem = n % 10;
            sumOfDigits = sumOfDigits+rem;
            productOfDigits = productOfDigits * rem;
        }

        int output = productOfDigits - sumOfDigits;
        return output;
    }
}











 */
