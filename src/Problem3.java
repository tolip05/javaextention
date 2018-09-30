import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,HashMap<String,Integer>>map = new HashMap<>();
             while (true){
                 String[] input = br.readLine().trim().split(" ");
                 if ("Statistics".equalsIgnoreCase(input[0])){
                     break;
                 }
                 switch (input[1]){
                     case "joined":
                         map.putIfAbsent(input[0],new HashMap<>());
                         break;
                     case "followed":
                         if (map.containsKey(input[2])){
                             map.get(input[2]).put(input[0],1);
                             map.get(input[0]).put("minus",-1);
                         }else{
                             break;
                         }
                         break;
                         default:
                             break;
                 }
             }


    }
}
