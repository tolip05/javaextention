import javax.sql.rowset.Predicate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Subota3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashMap<String, java.util.function.Predicate<Integer>> commands = new HashMap<>();
        while (true) {
            String[] input = br.readLine().split(";");
            if ("Forge".equals(input[0])) {
                break;
            }
            java.util.function.Predicate<Integer> predicate = makePredicate(input, arr);
            if ("Exclude".equalsIgnoreCase(input[0])) {
                commands.put(input[0] + input[1] + input[2], predicate);
            } else {
                commands.remove(input[1] + input[2]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            boolean forRemoove = false;
            for (Map.Entry<String, java.util.function.Predicate<Integer>> stringPredicateEntry
                    : commands.entrySet()) {
                if (stringPredicateEntry.getValue().test(i)) {
                    forRemoove = true;
                    break;
                }
                if (!forRemoove) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    private static java.util.function.Predicate<Integer> makePredicate(String[] input, int[] arr) {
        switch (input[1].toUpperCase()) {
            case "SUM LEFT":
                return index -> (index > 0 ? arr[index - 1] : 0) + arr[index] == Integer.valueOf(input[2]);

            case "SUM RIGHT":
                return index -> arr[index] + (index < arr.length - 1 ? arr[index + 1] : 0) == Integer.valueOf(input[2]);

            default:
                return index -> (index > 0 ? arr[index - 1] : 0) + arr[index] +
                        (index < arr.length - 1 ? arr[index + 1] : 0) == Integer.valueOf(input[2]);
        }
    }
}
