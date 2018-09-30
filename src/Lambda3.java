import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class Lambda3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []s = br.readLine().split(" ");
        Function<String,Integer>parse = x -> Integer.parseInt(x);
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += parse.apply(s[i]);
        }
        System.out.println(s.length);
        System.out.println(sum);
    }
}
