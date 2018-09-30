import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        HashMap<String,Integer>result = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            if (!result.containsKey(input[i])){
                result.put(input[i],1);
            }else{
                result.put(input[i],result.get(input[i]) + 1);
            }
        }
        for (String key : result.keySet()) {
            System.out.println(key + " - " + result.get(key) + " times");
        }
        for (Map.Entry<String,Integer> entry: result.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
        }
    }
}
