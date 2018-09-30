import java.util.Scanner;

public class Ganka2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position = Integer.parseInt(scanner.nextLine());
        int b = (1 << position);
        int c = position ^ (1 << 4);
        System.out.println(Integer.toBinaryString(1 << 4));

        System.out.println(Integer.toBinaryString(position));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
    }
}
