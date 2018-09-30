import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Izpit9 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       // int a = 82;
        int b = 10;
        int c = 1;
        int d = b + c;
       int a = b & c;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(a));
       // a = 5 & 6;
        System.out.println(a);
    }
}
