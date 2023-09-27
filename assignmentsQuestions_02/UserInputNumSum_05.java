package assignmentsQuestions_02;
import java.util.Scanner;
public class UserInputNumSum_05 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numbers: ");
            int count = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < count; i++) {
                if(count == "x"){
                    break;
                }
                int num = count;
                sum+=num;
            }

    }
    
}
