import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Badvance5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String,Double>sumsByTown= new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\|");
            String town = tokens[0].trim();
            double income = Double.parseDouble(tokens[1].trim());
            if (sumsByTown.containsKey(town)){
                sumsByTown.put(town,sumsByTown.get(town) + income);
            }else{
                sumsByTown.put(town,income);
            }
        }
        for (Map.Entry<String, Double> s : sumsByTown.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
    }
}
