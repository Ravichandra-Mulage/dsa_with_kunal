public class CountingOccurances_04 {
    public static void main(String[] args) {
        int num = 777777777;
        int count = 0;
        for (int i = 0; num > 0; i++) {
            int rem = num % 10;
            num = num / 10;
            if (rem == 7) {
                count++;
            }
        }
        System.out.println(count);

    }
}

        // String number = Integer.toString(num);

        // System.out.println(number);
        // int count = 0;

        // for (int i = 0; i < number.length(); i++) {
        // char checkNum = number.charAt(i);
        // if (checkNum == '7') {
        // count++;
        // }
        // }
        // System.out.println(count);
        
