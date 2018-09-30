import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Racursia4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
          reverse(a,0,a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void reverse(int[] arr, int start, int end) {
        if (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr,start + 1,end - 1);
        }
    }
}
