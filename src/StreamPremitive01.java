import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamPremitive01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tokens = Arrays.asList(scanner.nextLine().split(" "));
        DoubleStream stream = tokens.stream().filter(x -> !x.isEmpty()).mapToDouble(x -> Double.valueOf(x));
        OptionalDouble result = stream.average();

        if (result.isPresent()){
            System.out.printf("%.2f",result.getAsDouble());
        }else{
            System.out.println("No match");
        }

    }
}
