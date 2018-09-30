public class Matrix2 {
    public static void main(String[] args) {
        int[][]matrix = {
                {7, 1, 3, 3, 2, 1},
                {1, 3, 9, 8, 5, 6},
                {4, 6, 7, 9, 1, 0}
        };
        int bestSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCow = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                int sum = matrix[i][j] + matrix[i][j +1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (bestSum < sum){
                    bestSum = sum;
                    startRow = i;
                    startCow = j;

                }
            }
        }
        System.out.println(matrix[startRow][startCow] + ", " + matrix[startRow][startCow +1]);
        System.out.println(matrix[startRow + 1][startCow] + ", " + matrix[startRow + 1][startCow +1]);

    }
}
