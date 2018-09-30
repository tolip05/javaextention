import java.util.*;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        //List<List<List<String>>>sum = new ArrayList<>();

        List<Integer>list = new ArrayList<>();
        Stream<Integer>stream = list.stream();

        String[] arr = new String[10];
        Stream<String>str = Arrays.stream(arr);


        HashMap<String,String>map = new HashMap<>();
        Stream<Map.Entry<String,String>>entryes = map.entrySet().stream();
        Stream<String>key = map.keySet().stream();
        Stream<String>val = map.values().stream();


        List<String>string = new ArrayList<>();
        string.add("Pesho");
        string.add("Gosho");
        Stream<String>stringsStream = string.stream();
        Stream<Integer> intStream = stringsStream.map(x -> x.length());
        intStream.forEach(s -> System.out.println(s));


    }
}
