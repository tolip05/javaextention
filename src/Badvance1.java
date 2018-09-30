import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Badvance1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]arr = {1,2,3,4,5};
        String[]ara = {"Pesho","Gosho"};
        System.out.println(Arrays.toString(arr)
                .replaceAll("[\\[,\\]]",""));
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
        System.out.println(String.join(" ",ara));
    }
}
