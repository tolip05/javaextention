import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Racursia1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(sum(a,0));
        System.out.println(fac(5));

    }
    private static int fac(int n){
        if (n <= 1){
            return 1;
        }
        return  n * fac(n-1);
    }
    private static int sum(int[]a,int index){
        if (index == a.length - 1){
            return a[index];
        }
        return a[index] + sum(a,index + 1);
    }
}
