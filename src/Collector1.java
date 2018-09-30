import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector1 {
    public static void main(String[] args) {
        List<Integer>bounds = Stream.of(5,7).sorted().limit(2).collect(Collectors.toList());

         List<Integer> nums = Stream.of(1, 6, 5, 7, 8).collect(Collectors.toList());

         nums.stream().filter(x -> x >= Collections.min(bounds) && x <= Collections.max(bounds))
                 .forEach(x -> System.out.print(x + " "));

    }
}
