import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Stream06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>list = Arrays.asList(scanner.nextLine().split(" "));
        OptionalDouble first = list.stream().filter(s -> !s.isEmpty()).mapToDouble(s -> Double.valueOf(s))
                .filter(s -> s%2 ==0).min();
        if (first.isPresent()){
            System.out.printf("%.2f",first.getAsDouble());
        }else{
            System.out.println("No mach");
        }
    }
}
