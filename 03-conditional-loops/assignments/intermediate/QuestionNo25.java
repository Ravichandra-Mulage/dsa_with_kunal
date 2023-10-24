package assignments.intermediate;

import java.util.Scanner;

public class QuestionNo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aug = 31;
        int count =0;
        for (int i = 1; i < aug; i++) {
            if(i % 2==0){
                count ++;
            }
        }
        System.out.println("Kunal can go on "+count+" days out with his friends in the month of August.");
    }
}
