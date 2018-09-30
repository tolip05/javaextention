import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stream<String> str = Arrays.stream(scanner.nextLine().split("\\s+"));
        str.map(x -> x.toUpperCase()).forEach(x -> System.out.println(x + " "));
    }
}
