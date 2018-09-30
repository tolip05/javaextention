import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamHashMap01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int limit = Integer.parseInt(br.readLine());

        HashMap<String,List<Integer>>cityes = new HashMap<>();

        for (String s : input) {
            String[]tokens = s.split(":");
            String name = tokens[0];
            int countOfCity = Integer.parseInt(tokens[1]);

            cityes.putIfAbsent(name,new ArrayList<>());
            cityes.get(name).add(countOfCity);
        }
        cityes.entrySet().stream()
                .filter(getLimitPredicate(limit))
                .sorted(getSortedComparator())
                .forEach(getEntryConsumer());
    }

    private static Consumer<Map.Entry<String, List<Integer>>> getEntryConsumer() {
        return e ->{
            System.out.printf("%s :",e.getKey());
            e.getValue().stream().sorted((n1,n2) -> Integer.compare(n2,n1))
                    .limit(5).forEach(d -> System.out.printf("%d ",d));
            System.out.println();
        };
    }

    private static Comparator<Map.Entry<String, List<Integer>>> getSortedComparator() {
        return (e1,e2) -> Integer.compare(e2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                e1.getValue().stream().mapToInt(Integer::valueOf).sum());
    }

    private static Predicate<Map.Entry<String, List<Integer>>> getLimitPredicate(int limit) {
        return c -> c.getValue().stream().mapToInt(Integer::valueOf).sum()> limit;
    }
}
