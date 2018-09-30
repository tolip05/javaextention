import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Sorted2 {
    public static void main(String[] args)

    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int [] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean swapped = true;
        int x = Integer.parseInt(scanner.nextLine());

        do {
            swapped = false;
            for (int i = 0; i < b.length-1; i++) {
                if (b[i] > b[i +1]){
                    swap(b,i,i+1);
                    swapped = true;
                }
            }

        }while (swapped);
        System.out.println(Arrays.toString(b).replaceAll("[\\[\\]]",""));
        int sol = binary(b,x,0,b.length);
        System.out.println(sol);
    }

    private static int binary(int[] b, int x, int start, int end) {
        if (x > b[b.length - 1]){
            return -1;
        }
        while (start <= end) {
            int midle = (start + end) / 2;
            if (b[midle] < x) {
                start = midle + 1;
            }
            else if (b[midle] > x){
                end = midle - 1;
            }else{
                return midle;
            }
        }
        return  -1;
    }

    private static void swap(int[] b, int i, int i1) {
        int temp = b[i +1];
        b[i +1] = b[i];
        b[i] = temp;
    }
}
