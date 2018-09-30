import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Nedelq1 {
    public static void main(String[] args) {
        Predicate<Integer> check = x -> x >= 10 && x <=20;
        Consumer print = x -> System.out.print(x + " ");

        Stream.of(1, 2, 15, 15, 14, 18, 21).filter(check).distinct().limit(2)
                .forEach(print);
    }
}
