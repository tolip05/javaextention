import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        int d = 50;
        String s = String.format("%-10d || %50d",n,d);
        System.out.println(s);
    }
}
