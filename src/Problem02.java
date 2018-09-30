import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::valueOf).toArray();
        Deque<Integer> first = new ArrayDeque<>();
        Deque<Integer> gold = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            first.addLast(arr[i]);
        }

        while (true){

            String[] comannd = scanner.nextLine().trim().split(" ");

            if ("Revision".equalsIgnoreCase(comannd[0])){
                break;
            }
            if (comannd[0].equalsIgnoreCase("Apply")){
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
            }
            else if("Air".equalsIgnoreCase(comannd[0])){
                int dobavi = Integer.parseInt(comannd[2]);
                if (gold.size() > 0){
                    first.addLast(dobavi);
                    gold.poll();
                }
            }

        }
        for (Integer integer : first) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println(gold.size());
    }
}
