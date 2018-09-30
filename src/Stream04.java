import java.util.*;
import java.util.stream.Stream;

public class Stream04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Stream<String> names = Arrays.stream(scanner.nextLine().split(" "));
        List<String> names = Arrays.asList(scanner.nextLine().split("\\s+"));
        HashSet<Character>ch = new HashSet<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(s -> Character.toLowerCase(s.charAt(0)))
        .forEach(ch::add);

        Optional<String>firstName = names.stream().filter(c -> ch.contains(c.toLowerCase().charAt(0)))
        .sorted().findFirst();

        if (firstName.isPresent()){
            System.out.println(firstName.get());
        }else{
            System.out.println("No matches");
        }
    }
}
