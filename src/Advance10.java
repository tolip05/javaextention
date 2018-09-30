import java.util.ArrayList;
import java.util.Scanner;

public class Advance10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(", ");
        ArrayList<ArrayList<Integer>>matrix = new ArrayList<>();

        matrix.add(0,new ArrayList<>());
        matrix.add(1,new ArrayList<>());
        matrix.add(2,new ArrayList<>());

        for (String s : input) {
          int curentNumber = Integer.parseInt(s) ;
          matrix.get(Math.abs(curentNumber % 3)).add(curentNumber);
        }
        for (ArrayList<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
