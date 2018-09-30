import java.util.ArrayList;
import java.util.function.Function;

public class Funkciq03 {
    public static void main(String[] args) {
        String[] arr = "1, 5, 8, 45, 1, 2, 3, 6, 44".split(", ");
        Function<String,Integer> parse = x -> Integer.parseInt(x);
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += parse.apply(arr[i]);
        }
        System.out.println(arr.length);
        System.out.println(sum);
    }
}
