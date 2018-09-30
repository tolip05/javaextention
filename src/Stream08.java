import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> bound;
        bound = Stream.of(scanner.nextLine()
                .split(" ")).map(Integer::valueOf)
                .sorted().collect(Collectors.toList());
        Stream.of(scanner.nextLine().split(" "))
                .map(Integer::valueOf)
                .filter(x -> bound.get(0) <= x && x <= bound.get(1))
                .forEach(s -> System.out.print(s + " "));
        System.out.println();


    }
}
