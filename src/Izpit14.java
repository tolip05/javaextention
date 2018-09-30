import java.util.*;

public class Izpit14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,List<Integer>>map = new HashMap<>();
        while (true){
            String[] input = scanner.nextLine().split(" ");
            if ("end".equalsIgnoreCase(input[0])) {
                break;
            }
                String name = input[0];
                Integer num = Integer.valueOf(input[1]);
                map.putIfAbsent(name, new ArrayList<>());
                map.get(name).add(num);

            }
        map.entrySet().stream().sorted((a,b) ->
                Integer.compare(b.getValue().stream().mapToInt(s ->s).sum()
                        ,a.getValue().stream().mapToInt(d-> d).sum()))
                .forEach
                        (x -> System.out.println("key " + x.getKey() + " valiu => "
                                + x.getValue().toString().replaceAll("[\\[\\],]","")));
        }

    }
