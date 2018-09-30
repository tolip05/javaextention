import java.util.*;

public class Petuk13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sum = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer>rev = new ArrayList<>();
        for (int i = 0; i < sum.length; i++) {
            rev.add(sum[i]);
        }
        Collections.reverse(rev);
        for (Integer in : rev) {
            System.out.print(in + " ");
        }
        System.out.println();
    }
}
