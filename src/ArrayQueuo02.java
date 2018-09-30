import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class ArrayQueuo02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queu = new ArrayDeque<>();
        String[] children = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        Collections.addAll(queu, children);
        int counter = 1;
        while (queu.size() > 1) {
            for (int i = 1; i < n; i++) {
                String firstChaild = queu.poll();
                queu.offer(firstChaild);
            }
            if (isPrime(counter)) {
                System.out.println("Prime " + queu.peek());
            } else {
                System.out.println("Removed " + queu.poll());
            }
            counter ++;
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int divader = 2; divader <= Math.sqrt(number); divader++) {
            if (number % divader == 0) {
                return false;
            }
        }
        return true;
    }
}
