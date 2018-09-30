import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Advance12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        String []input = scanner.nextLine().split(" ");
        int[]arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i <arr.length / 2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<String>list = new ArrayList<>();
        list.add("Kosta");
        list.add("Lidia");
        list.add("Katia");
        list.add("Pesho");
        list.add("Simeon");
        list.forEach(e -> System.out.println(e));
    }

}
