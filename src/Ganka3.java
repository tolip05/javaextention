import java.util.Arrays;
import java.util.Scanner;

public class Ganka3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bluArray = Integer.parseInt(scanner.nextLine());
        int[] matrixSize = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[matrixSize[0]][];
        for (int i = 0; i < matrixSize[0]; i++) {
            int[] matrixValue = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = matrixValue;
        }
        int[] target = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == target[0] && j == target[1]){
                    matrix[i][j] += bluArray;
                }
                else if (i + 1 == target[0] && j == target[1]){
                    matrix[i][j] += bluArray;
                }
                else if (i == target[0] && j + 1 == target[1]){
                    matrix[i][j] += bluArray;
                }
                else if (i + 1 == target[0] && j + 1 == target[1]){
                    matrix[i][j] += bluArray;
                }
                else if (i - 1 == target[0] && j == target[1]){
                    matrix[i][j] += bluArray;
                }
                else if (i == target[0] && j - 1 == target[1]){
                    matrix[i][j] += bluArray;
                }
                else if (i - 1 == target[0] && j - 1 == target[1]){
                    matrix[i][j] += bluArray;
                }
                else if (i - 1 == target[0] && j + 1 == target[1]){
                    matrix[i][j] += bluArray;
                }
                else if (i + 1 == target[0] && j - 1 == target[1]){
                    matrix[i][j] += bluArray;
                }
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
