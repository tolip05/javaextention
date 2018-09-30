import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Stream2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Optional<String> first = Arrays.stream(scanner.nextLine().split(" ")).sorted()
                .findFirst();
        if (first.isPresent()){
            System.out.println(first.get());
        }else{
            System.out.println("No");
        }
    }
}
