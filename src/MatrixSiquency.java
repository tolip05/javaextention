import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MatrixSiquency {
    private static int SEQUENS_COUNT = 0;
    private static String SEQUENS_ELEMENT = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dim = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(dim[0]);
        int cols = Integer.parseInt(dim[1]);

        String[][] matrix = new String[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        List<String> sequency = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            sequency.addAll(Arrays.asList(matrix[i]));
            chekForSequens(sequency);
        }
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                sequency.add(matrix[row][col]);
            }
            chekForSequens(sequency);
        }
        int diagSize = Math.min(rows,cols);
        for (int i = 0; i < diagSize; i++) {
            sequency.add(matrix[i][i]);
        }
        chekForSequens(sequency);

        for (int i = 0; i < SEQUENS_COUNT; i++) {
            System.out.printf("%s, ",SEQUENS_ELEMENT);
        }
    }

    private static void chekForSequens(List<String> sequency) {
        for (int startPos = 0; startPos < sequency.size() - 1; startPos++) {
            int counter = 1;
            String symbol = sequency.get(startPos);
            int curPosit = startPos + 1;
            while (symbol.equals(sequency.get(curPosit))){
                counter ++;
                if (counter >= SEQUENS_COUNT){
                    SEQUENS_COUNT = counter;
                    SEQUENS_ELEMENT = symbol;
                }
                curPosit++;
                if (curPosit >= sequency.size()){
                    break;
                }
            }
        }
        sequency.clear();
    }
}
