import java.util.Scanner;
import java.util.function.Function;

public class Funkcia02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int a = Integer.parseInt(scanner.nextLine());
        Function<Integer,Integer>sum = s -> s + 1;
        int b = sum.apply(5);
        int c = sum.apply(b);
        System.out.println(c);
        System.out.println(sum.apply(100));
    }
}
