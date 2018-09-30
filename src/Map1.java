import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String,Integer>map = new HashMap<>();
        map.put("Mariika",4);
        map.put("Iglika",5);
        map.put("Stoqnka",6);

        for (String s : map.keySet()) {
            Integer nums = map.get(s);


            System.out.println(s + " " + nums);
        }
    }
}
