import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stream<String> strStream = Stream.of(scanner.nextLine().split(" "));
        Comparator<Integer>check = (x1,x2) -> x1.compareTo(x2);
        Predicate<Integer> pred = s -> s%2 ==0;
        Optional<Integer> o =strStream.filter(s -> !s.isEmpty()).map(n -> Integer.parseInt(n)).filter(pred)
                .min(Integer::compare);
        System.out.println(o.get());
    }
}
