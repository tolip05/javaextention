import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class ArrayQueuo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String>queu = new ArrayDeque<>();
        String[] children = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        Collections.addAll(queu,children);
        while (queu.size()> 1){
            for (int i = 1; i < n; i++) {
             String firstChaild = queu.poll();
             queu.offer(firstChaild);
            }
            System.out.println("Removed " + queu.poll());
        }
        System.out.println("Last is " + queu.poll());
    }
}
