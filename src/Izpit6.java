import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Izpit6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Long>playerPointer=new LinkedHashMap<>();
        Map<String,List<String>>playerOponents=new HashMap<>();

        while (true){
            String[] input = br.readLine().split(" ");
            if ("usa!".equals(input)){
                break;
            }
            Integer player1Points = Integer.valueOf(input[0]);
            Integer player2Points = Integer.valueOf(input[2]);
            int sum = player1Points - player2Points;
            int sum1 = player2Points - player1Points;
            String[] names = input[1].split("<->");
            filMaps(names[0],names[1],playerPointer,playerOponents,sum);
            filMaps(names[1],names[0],playerPointer,playerOponents,sum1);

            StringBuilder result = new StringBuilder();
            playerPointer.entrySet().stream()
                    .sorted((a,b) -> Long.compare(b.getValue(),a.getValue()))
                    .forEach(v ->{
                        result.append(v.getKey()).append(" - (")
                            .append(v.getValue()).append(")").append("\n");
                        playerOponents.get(v.getKey()).forEach(s -> result.append(s)
                                .append("\n")); });
            System.out.println(result);
        }
    }

    private static void filMaps(String name, String name1,
                                Map<String, Long> playerPointer,
                                Map<String, List<String>> playerOponents, int sum) {
        if (!playerPointer.containsKey(name)){
            playerPointer.put(name,0L);
        }
        playerPointer.put(name,playerPointer.get(name) + sum);
        if (!playerOponents.containsKey(name)){
            playerOponents.put(name,new ArrayList<>());
        }
        playerOponents.get(name).add("+  " + name1 + " <-> " + sum);
    }


}
