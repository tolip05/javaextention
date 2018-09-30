import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algoritum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(asas(a,b));
        int f = Integer.parseInt(scanner.nextLine());
        List<Integer> sumi = new ArrayList<>();
            sumi.add(fibo(f));

        for (Integer integer : sumi) {
            System.out.print(integer);
        }
        System.out.println();
    }

    private static int fibo(int f) {
        while (true){
            if (f < 2){
                return 1;
            }
        }
    }

    private static int asas(int a, int b) {
        while (b > 0){
            int swap = b;
            b = a % b;
            a = swap;
        }
        return a;
    }
}
