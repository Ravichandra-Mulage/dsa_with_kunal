public class SwapNums {
    public static void main(String[] args) {

        swap(10,20);
    }
    static int swap(int a, int b){
        int temp = a;
         a = b;
         b = temp;
        System.out.println(" a = "+a+" b = "+b);
        return 0;
    }
}
