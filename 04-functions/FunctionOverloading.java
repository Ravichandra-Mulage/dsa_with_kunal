public class FunctionOverloading
{
    public static void main(String[] args) {
        nums("Ravichandra");
    }
    static int nums(int a, int b){
        System.out.println( a+b);
        return 0;
    }
    static String nums(String name){
        System.out.println(name);
        return null;
    }
}
