package Lectures_pgms;
import java.util.Scanner;

public class AddBonus_02 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.println("Enter you salary: ");

    int salary = sc.nextInt();
    if(salary> 10000){
        salary+=2000;
    } else{
        salary+=1000;
    }
    System.out.println("Your added bonus salary is: "+ salary);

    }
   
}
