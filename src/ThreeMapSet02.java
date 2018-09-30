import java.util.Scanner;
import java.util.TreeMap;

public class ThreeMapSet02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String,Double>results = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] scores = scanner.nextLine().split(" ");
            double sumOfScore = 0;
            for (String score : scores) {
                sumOfScore += Double.parseDouble(score);
                results.put(name, sumOfScore / scores.length);
            }
        }
        for (String key : results.keySet()) {
            System.out.println( key + " is gradueted with " + results.get(key));
        }
    }
}
