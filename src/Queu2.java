import java.util.Arrays;
import java.util.Scanner;

public class Queu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int []arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int b = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int c = (arr[i] + arr [i + 1]) / 2;
            if (arr[i] != c){
                b = c;
            }
        }
        System.out.println(b);
    }
}
