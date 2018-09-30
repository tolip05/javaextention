import java.util.Scanner;

public class BitovoRazmestvane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int mask = 1 << 3;
        int thirthBit = (number & mask) >> 3;


        mask = 1 << 24;
        int second = (number & mask) >> 24;

        if (thirthBit == second){
            System.out.println(number);
            return;
        }
        if (thirthBit == 0){
            mask = ~(1 << 24);
            number = number & mask;
        }
        if (thirthBit == 1){
        mask = 1 << 24;
        number = number | mask;
        }
        if (second == 0){
            mask = ~(1 << 3);
            number = number & mask;
        }
        if (second == 1){
            mask = 1 << 24;
            number = number | mask;
        }
        System.out.println(number);
    }
}
