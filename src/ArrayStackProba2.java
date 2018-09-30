import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayStackProba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        ArrayDeque<Character>queu = new ArrayDeque<>();

        for (char c : name.toCharArray()) {
            queu.offer(c);
        }
        boolean isPalendrom = true;

        while (queu.size()> 1){
            char second = queu.poll();
            char first = queu.pollLast();

            if (first != second){
                isPalendrom = false;
                break;
            }
        }
        System.out.println(isPalendrom);
    }
}
