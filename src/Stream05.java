import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Stream05 {
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        Collections.addAll(names,"one","two","pesho","gosho");
        Stream<String>stream = names.stream().map(s -> s ="hi" + s).distinct()
                .sorted().filter(s -> s.length()<20).skip(1);
        for (String name : names) {
            System.out.println(name + " ");
        }
        stream.forEach(s -> System.out.println(s));
    }
}
