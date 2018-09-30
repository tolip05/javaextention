import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Stream5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OptionalDouble average = Arrays.stream(scanner.nextLine().split(" ")).filter(s -> !s.isEmpty())
                .mapToDouble(Double::parseDouble).average();

        if (average.isPresent()){
            System.out.printf("%.2f",average.getAsDouble());
        }else{
            System.out.println("No");
        }
    }
}
