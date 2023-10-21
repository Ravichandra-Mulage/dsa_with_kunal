public class ArmstrongNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }
    static boolean armstrong(int originalnum){
        int sum =0;
        int rem = 0;
        int number = originalnum;
//        for (i = 0; number!=0 ; i++) {
//            number/=10;
//        }
        number = originalnum;
        while (number != 0) {
            rem = number % 10;
            sum += Math.pow(rem,3);
            number/=10;
        }
       return sum == originalnum;
    }
}
