import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 2, 1, 3, 5, 7, 1, 4, 2, 12);
        ArrayList <Integer>numbers = new ArrayList();
        numbers.addAll(input);
        numbers.removeIf(n -> n%2 != 0);
        numbers.sort((n,m) -> n.compareTo(m));
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
