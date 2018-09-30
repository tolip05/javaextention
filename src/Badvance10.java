import java.util.Arrays;
import java.util.Scanner;

public class Badvance10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        int[]arr = new int [n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]= Integer.parseInt(scanner.nextLine());
//        }
//        System.out.println(Arrays.toString(arr));
        Integer[] ars = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt)
                .toArray(Integer[]::new);
        for (int i = 0; i < ars.length/2; i++) {
            int temp = ars[ars.length - 1 - i];
            ars[ars.length - 1 - i] = ars[i];
            ars[i] = temp;
        }
        System.out.println(Arrays.toString(ars).replaceAll("[\\[\\,\\]]",""));
    }
}
