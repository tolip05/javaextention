import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunction01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = "1 5 4 2 1 12 10 5 3".split(" ");
        BiFunction<String,String,Integer> sum = (x,y) -> Integer.parseInt(x) + Integer.parseInt(y);
        int res = 0;

        for (int i = 0; i < arr.length - 1; i+=2) {
            res += sum.apply(arr[i],arr[i + 1]);

        }
        if (arr.length%2 != 0){
            res += Integer.valueOf(arr[arr.length - 1]);
        }
        System.out.println(res);

    }
}
