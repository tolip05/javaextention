import java.util.*;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.asList(scanner.nextLine().split(" "));
        HashSet<Character>letters = new HashSet<>();

        Stream.of(scanner.nextLine().split(" "))
                .map(c -> c.toLowerCase().charAt(0))
                .forEach(c -> letters.add(c));
        Optional<String> first = names.stream()
                .filter(s -> letters.contains(s.toLowerCase().charAt(0)))
                .sorted().findFirst();

        if (first.isPresent()){
            System.out.println(first.get());
        }else{
            System.out.println("No");
        }
    }
}
