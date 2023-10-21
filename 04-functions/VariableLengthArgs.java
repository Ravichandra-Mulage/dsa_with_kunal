import java.util.Arrays;

public class VariableLengthArgs {
    public static void main(String[] args) {
        names();
    }
    static void names(String...v){
        System.out.println(Arrays.toString(v));
    }
}
