import java.util.Arrays;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::valueOf).toArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[i] = (arr[i] & arr[j]);
               // arr[j] = arr[i] | arr[j];
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}