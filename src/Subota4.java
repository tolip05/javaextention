import java.util.Arrays;
import java.util.Scanner;

public class Subota4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] sos = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
          int a = 0;
        for (int i = 0; i < sos.length; i++) {
             a += sos[i];
            System.out.print(sos[i] + " ");
        }
        System.out.println(a);
    }
}
