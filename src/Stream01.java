import java.util.*;

public class Stream01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arr = scanner.nextLine().split(" ");
        List<Integer>nums = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            nums.add(Integer.valueOf(arr[i]));
        }
        nums.stream().distinct()
                .filter(x -> 10 <= x && x <= 20)
                .limit(2)
                .forEach(x -> System.out.println(x));


    }
}
