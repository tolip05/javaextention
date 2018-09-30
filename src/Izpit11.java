import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Izpit11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String,LinkedHashMap<String,Long>>countryes = new LinkedHashMap<>();

        String[] input = br.readLine().split("\\|");

        while (!"report".equalsIgnoreCase(input[0])){
            countryes.putIfAbsent(input[1],new LinkedHashMap<>());
            countryes.get(input[1]).put(input[0],Long.valueOf(input[2]));
            input = br.readLine().split("\\|");
        }
        countryes.entrySet().stream().sorted(sortMap())
                .forEach(n ->{ System.out.println(n.getKey() + "(total population: " + n.getValue().values()
                        .stream().mapToLong(k -> k).sum()+ ")");
                n.getValue().entrySet().stream().sorted(sortValue())
                .forEach(x -> System.out.println("=>" + x.getKey() + ":" + x.getValue()));});
    }

    private static Comparator<Map.Entry<String, Long>> sortValue() {
        return (b,c) -> c.getValue().compareTo(b.getValue());
    }

    private static Comparator<Map.Entry<String, LinkedHashMap<String, Long>>> sortMap() {
        return (a,b) -> Long.compare(b.getValue().values()
                .stream().mapToLong(m -> m).sum(),
                a.getValue().values().stream().mapToLong(s -> s).sum());
    }
}
