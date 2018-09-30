import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ganka5{
    private static List<String>tempResult = new ArrayList<>();
    private static List<String>result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []matrixSize = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][]matrix = new String[matrixSize[0]][];
        for (int i = 0; i < matrixSize[0]; i++) {
            String []line = scanner.nextLine().split("\\s+");
            matrix[i] = line;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tryLine(matrix,i,j);
                tryColumn(matrix,i,j);
                tryDiagonal(matrix,i,j);
            }

        }
        System.out.println(result.toString().replaceAll("[\\[\\]]",""));
    }

    private static void tryDiagonal( String[][] matrix, int row, int col) {

        tempResult.clear();
        int curentCol = col;
        int curentRow = row;
        tempResult.add(matrix[curentRow][curentCol].toUpperCase());
        while (true) {
            if (curentRow + 1 < matrix.length && curentCol + 1 < matrix[0].length) {
                if (matrix[curentRow][curentCol].equals(matrix[curentRow + 1][curentCol + 1])) {
                    tempResult.add(matrix[curentRow][curentCol].toUpperCase());
                }
            } else {
                if (tempResult.size() > result.size()) {
                    result.clear();
                    for (int s = 0; s < tempResult.size(); s++) {
                        result.add(tempResult.get(s).toUpperCase());
                    }

                }
                break;
            }
            curentCol++;
            curentRow++;
        }
    }

    private static void tryColumn( String[][] matrix, int row, int col) {
        tempResult.clear();
        tempResult.add(matrix[row][col].toUpperCase());
        for (int i = row; i < matrix.length - 1; i++) {
            if (matrix[i][col].equals(matrix[i + 1][col])) {
                tempResult.add(matrix[i][col].toUpperCase());
            } else {
                break;

            }

        }
        if (tempResult.size() > result.size()) {
            result.clear();
            for (int s = 0; s < tempResult.size(); s++) {
                result.add(tempResult.get(s).toUpperCase());
            }

        }
    }

    private static void tryLine( String[][] matrix, int row, int col) {
        tempResult.clear();
        tempResult.add(matrix[row][col].toUpperCase());
        for (int i = col; i < matrix[row].length-1; i++) {


            if (matrix[row][i].equals(matrix[row][i+1])){
                result.add(matrix[row][i].toUpperCase());
            }else{
                break;

                }

            }
        if (tempResult.size() > result.size()){
            result = tempResult;
        }

    }
}