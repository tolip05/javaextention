import java.util.Scanner;

public class Binary1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        int mask = 1 << position;
        int result = mask & number;
             result = result >> position;
        System.out.println(result);

    }
}
