import java.util.HashMap;
import java.util.Scanner;

public class Izpit13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,HashMap<Integer,Integer>>map = new HashMap<>();
        while (true){
            String[]tokens = scanner.nextLine().trim().split("\\s+");
            if (tokens[0].equalsIgnoreCase("end")){
                break;
            }
            String name = tokens[0];
            Integer first = Integer.valueOf(tokens[1]);
            Integer second = Integer.valueOf(tokens[2]);

            map.putIfAbsent(name,new HashMap<>());
            map.get(name).put(first,second);
        }
        map.entrySet().stream().sorted((b,a)->
                Integer.compare(b.getValue().values().stream().mapToInt(s -> s).sum(),
                        a.getValue().values().stream().mapToInt(d->d).sum()))
                .forEach(x ->{ System.out.println("key => " + x.getKey());
                x.getValue().entrySet().stream()
                        .forEach(q -> System.out.println("value => " +
                                q.getKey() + "\nvalues =>" + q.getValue()));});
    }
}
