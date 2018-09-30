import java.util.*;
import java.util.stream.Collectors;

public class Izpit4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<List<Integer>>allNumbers = new ArrayDeque<>();
        List<Integer>output = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            allNumbers.addLast
                    (Arrays.stream(scanner.nextLine().split(" ")).map(Integer::valueOf)
                    .collect(Collectors.toList()));
        }
        while (!allNumbers.isEmpty()){
            List<Integer>curentNumber = allNumbers.pop();
            int wave = curentNumber.get(0);
            for (int i = 0; i < curentNumber.size(); i++) {

                if (wave < curentNumber.get(i)){
                    allNumbers.addLast(curentNumber.subList(i,curentNumber.size()));
                    break;
                }
            }
            output.add(wave);
        }
        System.out.println(output.size());
        System.out.println(Arrays.toString(output.toArray())
                .replaceAll("[\\[\\],]",""));
    }
}
