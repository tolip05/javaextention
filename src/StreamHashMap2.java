import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamHashMap2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,LinkedHashMap<String,Long>>countryes = new LinkedHashMap<>();

        while (true){
            String[]line = br.readLine().split("\\|");
            if ("report".equalsIgnoreCase(line[0])){
                break;
            }
            if (!countryes.containsKey(line[1])){
                countryes.put(line[1],new LinkedHashMap<>());
                countryes.get(line[1]).put(line[0],Long.valueOf(0L));
            }
            countryes.get(line[1]).put(line[0],Long.valueOf(line[2]));
        }
        HashMap<String,Long>countryPopulation = new LinkedHashMap<>();

        for (String country : countryes.keySet()) {
            Long sum = 0L;
            for (String s : countryes.get(country).keySet()) {
                sum += countryes.get(country).get(s);
            }
            countryPopulation.put(country,sum);
        }
        countryPopulation.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach(b -> {
                    System.out.println(b.getKey() + "(total population: " + b.getValue() + ")");
                    countryes.get(b.getKey()).entrySet().stream()
                            .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                            .forEach(a -> System.out.println("=>" + a.getKey() + ": " + a.getValue()));
                });
    }
}
