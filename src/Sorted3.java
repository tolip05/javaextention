import java.util.Arrays;
import java.util.Scanner;

public class Sorted3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
       int [] b = {5, 4, 8, 10, 2, 7};
       int a = -1;
        for (int i = 0; i < b.length; i++) {

            if (b[i] == num){
                a = i;
                break;
            }
        }
        System.out.println(a);
    }
}
