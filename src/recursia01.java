import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursia01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
         long a = fib(n);
        System.out.println(a);

    }

    private static int fib(long n) {
        if (n <= 2){
            return 1;
        }else {
            return fib (n - 1) + fib(n - 2);
        }
    }


}
