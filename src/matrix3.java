import java.util.Scanner;

public class matrix3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][]pascal = pascalProblem(n);
        for (int[] ints : pascal) {
            for (int anInt : ints) {
                if (anInt != 0){
                    System.out.print(anInt + " ");
                }
            }
            System.out.println();
        }
    }

    private static int[][] pascalProblem(int n) {
        int [][]res = new int[n][n];
        for (int row = 0; row < n; row++) {
            res[row][0] = 1;
            res[row][row] = 1;
            if (row > 1){
                for (int col = 1; col < n; col++) {
                    int[]previousRow = res[row - 1];
                    int sum = previousRow[col - 1] + previousRow[col];
                    res [row][col]= sum;
                }
            }
        }
        return res;
    }
}
