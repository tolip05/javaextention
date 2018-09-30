import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Stream7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Optional<Integer> ops= Stream.of(scanner.nextLine().split(" "))
                .filter(s -> isNumeric(s)).map(Integer::parseInt).reduce((x1,x2) -> x1 * x2);
        if (ops.isPresent()){
            System.out.println(ops.get());
        }else {
            System.out.println("No Match");
        }

    }

    private static boolean isNumeric(String s) {
        //return s.matches("-?\\d+(\\.\\d+)?");
        return s.matches("[!0-9+]");
    }
}
