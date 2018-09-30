import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Stream07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tokens = Arrays.asList(scanner.nextLine().split(" "));
        Optional<Integer> red = tokens.stream()
                .filter(x -> isNumbers(x))
                .map(Integer::valueOf)
                .reduce((x, y) -> x + y);

        if (red.isPresent()){
            System.out.println(red.get());
        }else{
            System.out.println("No match");
        }


    }

    private static boolean isNumbers(String str) {
        try {
            Integer nums = Integer.valueOf(str);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
