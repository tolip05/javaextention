import java.util.Scanner;

public class Badvance9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if (!metod(a, b, c) && !metod(b, c, a) && !metod(a, c, b)) {
            System.out.println("No");
        }
    }

    private static boolean metod(int a, int b, int c) {
        if (a + b != c) {
            return false;
        }
        int first = Math.min(a,b);
        int second = Math.max(a,b);
         System.out.printf("%d + %d = %d",first,second,c);
         return true;
    }
}
