package assignments;

import java.util.Scanner;

public class GreetingMessage_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Konichiwa "+name);
    }
}
