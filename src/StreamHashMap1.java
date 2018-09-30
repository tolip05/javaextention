import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamHashMap1 {
    public static void main(String[] args) {
        HashMap<String,List<Integer>> cities = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        List<String> tokens = Arrays.asList(scanner.nextLine().split("\\s+"));

        for (String token : tokens) {
            String[] tokensArgs = token.split(":");
            String city = tokensArgs[0];
            int distinktPopulation = Integer.valueOf(tokensArgs[1]);

            cities.putIfAbsent(city,new ArrayList<>());
            cities.get(city).add(distinktPopulation);
        }
        int bound = Integer.parseInt(scanner.nextLine());

        cities.entrySet()
                .stream().filter(getFilterByPopulation(bound))
                .sorted(getSortByPopulationComparator())
                .forEach(print());

    }

    private static Consumer<? super Map.Entry<String,List<Integer>>> print() {
        return kv -> {
            System.out.print(kv.getKey() + ": ");
            kv.getValue().stream().sorted((s1,s2) -> s2.compareTo(s1))
                    .limit(5).forEach(dp -> System.out.print(dp + " "));
            System.out.println();
        };
    }

    private static Comparator<? super Map.Entry<String,List<Integer>>> getSortByPopulationComparator() {
        return (kv1,kv2) -> Integer.compare
                (kv2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                kv1.getValue().stream().mapToInt(Integer::valueOf).sum());
    }

    private static Predicate<? super Map.Entry<String,List<Integer>>> getFilterByPopulation(int bound) {
        return kv -> kv.getValue().stream().mapToInt(Integer::valueOf).sum() >= bound;
    }
}
