import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stream<String>names = Arrays.stream(scanner.nextLine().split(" "));
        List<String> letters = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Optional<String>first =
                names.filter(s -> letters.contains(String.valueOf(s.charAt(0))
                        .toLowerCase())).sorted().findFirst();
        if (first.isPresent()){
            System.out.println(first.get());
        }else{
            System.out.println("No");
        }

    }
}
