package assignments;

import java.util.Scanner;

public class InrToUsd_06 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rupees: ");
        float rupee = sc.nextFloat();
        
        float doller = rupee * 0.012f;

        System.out.println("Your indian rupee in us doller is(approximately): "+doller);
}    
    
}
