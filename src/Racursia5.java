import java.util.Arrays;
import java.util.Scanner;

public class Racursia5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(arr,target));
    }

    private static int binarySearch(int[] arr, int target) {
        return binary(arr,0,arr.length - 1,target);
    }

    private static int binary(int[] arr, int start, int end, int target) {
        int midle = (start + end)/2;
        if (end < start){
            return -1;
        }
        if (target == arr[midle]){
            return midle;
        }
        else if (target < arr[midle]){
            return binary(arr,start,midle - 1,target);
        }
        else  {
            return  binary(arr,midle + 1,end,target);
        }
    }
}
