

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Paceg1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        int [] arr = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int students = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = students; i < arr.length; i++ ) {
            int raz = arr[i - 1] - arr[i - students];
            if (min > raz){
                min = raz;
            }
        }
        System.out.printf("Min Difference is %d.",min);
    }
}
