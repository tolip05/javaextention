import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StreamHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,List<Integer>>cityes = new HashMap<>();

        String[] tokens = scanner.nextLine().split("\\s+");
        int limit = Integer.parseInt(scanner.nextLine());

        for (String token : tokens) {
            String[] cityArgs = token.split(":");
            String cityName = cityArgs[0];
            int districtPopulation = Integer.parseInt(cityArgs[1]);

            cityes.putIfAbsent(cityName,new ArrayList<>());
            cityes.get(cityName).add(districtPopulation);
        }
        cityes.entrySet().stream().filter(c -> c.getValue().stream().mapToInt(Integer::valueOf).sum() > limit)
                .sorted((e1,e2) ->Integer.compare(e2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        e1.getValue().stream().mapToInt(Integer::valueOf).sum())
                        ).forEach(e ->{
            System.out.printf("%s: ",e.getKey());
            e.getValue().stream().sorted((en1,en2) -> Integer.compare(en2,en1))
                    .limit(5).forEach(d -> System.out.printf("%d ",d));
            System.out.println();
        });

    }
}
