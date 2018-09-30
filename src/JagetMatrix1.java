import java.util.Scanner;

public class JagetMatrix1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] jaget = new int[5][];
        for (int i = 0; i < jaget.length; i++) {
            String[] inputNumbers = scanner.nextLine().split("\\s+");
            jaget[i] = new int [inputNumbers.length];
            for (int j = 0; j < jaget[i].length; j++) {
                jaget[i][j] = Integer.parseInt(inputNumbers[j]);
            }
        }
    }
}
