import java.util.*;

public class Funkciq01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.asList(1, 2, 6, 4, 10, 3, 1, 7, 5);
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(input);
        list.removeIf(n -> n%2 != 0);
        list.sort((a,b) -> a.compareTo(b));

        for (Integer in : list) {
            System.out.print(in + " ");
        }
        System.out.println();


    }
}
