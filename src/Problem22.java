import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Problem22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer>first = new ArrayDeque<>();
        int [] arr =
                Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        for (int i = 0; i < arr.length; i++) {
            first.addLast(arr[i]);
        }
        Deque<Integer> gold = new ArrayDeque<>();

        while (true){

            String[] comannd = br.readLine().trim().split(" ");
            if ("Revision".equalsIgnoreCase(comannd[0])){
                break;
            }
            switch (comannd[0]){
                case "Apply":

                int count = Integer.valueOf(comannd[2]);
                for (int i = 0; i < count; i++) {
                    int stone = first.poll();
                    stone --;
                    if (stone == 0){
                        gold.addLast(stone);
                    }
                    else{
                        first.addLast(stone);
                    }
                }
                break;
                case "Air":
                    int dobavi = Integer.parseInt(comannd[2]);
                    if (gold.size() > 0){
                        first.addLast(dobavi);
                        gold.poll();
                    }
                    break;
                    default:
                        break;
            }
        }
        for (Integer integer : first) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println(gold.size());
    }
}
