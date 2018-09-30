import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int value = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        if (value == 0){
            int mask = ~(1 << position);
            int result = number & mask;
            System.out.println(result);
        }
        else{
           int mask = 1 << position;
           int result = number | mask;
            System.out.println(result);
        }
    }

}

