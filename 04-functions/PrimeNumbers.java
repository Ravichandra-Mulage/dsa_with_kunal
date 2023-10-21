public class PrimeNumbers {
    public static void main(String[] args) {
        primeNums(99);
    }
    static int primeNums(int num) {
        int nums = num / 2;
        boolean isNotPrime = false;
        for (int i = 2; i <= nums; i++) {
            if (num % i == 0) {
                isNotPrime = true;
                break;
            }
        }
        if (isNotPrime) {
            System.out.println("The number "+ num+ " is not prime.");
        } else {
            System.out.println("The number "+ num +" is prime.");
        }
        return 0;
    }

}
