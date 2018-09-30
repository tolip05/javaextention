import javax.print.attribute.IntegerSyntax;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Izpit10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\|");

        LinkedHashMap<String,LinkedHashMap<String,Long>> countryes = new LinkedHashMap<>();

        while (!"report".equalsIgnoreCase(input[0])){
            countryes.putIfAbsent(input[1],new LinkedHashMap<>());
            countryes.get(input[1]).put(input[0],Long.valueOf(input[2]));
            input = br.readLine().split("\\|");
        }
        countryes.entrySet()
                .stream()
                .sorted((a,b) ->
                        Long.compare(b.getValue().values().stream().mapToLong(Long::valueOf).sum(),
                            a.getValue().values().stream().mapToLong(Long::valueOf).sum()))
                .forEach(n -> {
                    System.out.println(n.getKey() + "(total population: " + n.getValue().values().stream()
                    .mapToLong(m -> m).sum() + ")");
                    n.getValue().entrySet().stream().sorted((c,d) -> d.getValue().compareTo(c.getValue()))
                            .forEach(x -> System.out.println("=>"+ x.getKey() + ": " + x.getValue()));
                });
    }
}
