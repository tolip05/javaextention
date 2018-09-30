import java.util.*;

public class Badvance4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer>crazyMap = new HashMap<>();
        crazyMap.put("Pesho",4);
        crazyMap.put("Gosho",3);
        crazyMap.put("Milen",9);
        crazyMap.put("Vasil",4);

        System.out.println(crazyMap);
        HashMap<String,ArrayList<Integer>>data = new HashMap<>();
        data.put("Pesho",new ArrayList<>());
        data.get("Pesho").add(12);
        data.get("Pesho").add(15);
        data.get("Pesho").add(1);
        System.out.println(data);

        HashMap<String,ArrayList<Integer>>grades = new HashMap<>();
        grades.put("Peter",new ArrayList<>(Arrays.asList(5)));
        grades.put("George",new ArrayList<>(Arrays.asList(5,5,6)));
        grades.put("Alice",new ArrayList<>(Arrays.asList(5,4,4)));

        for (Map.Entry<String, ArrayList<Integer>> a : grades.entrySet()) {
            System.out.println("" + a.getKey() + " -> " + a.getValue());
        }


    }
}
