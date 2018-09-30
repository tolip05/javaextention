import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows= Integer.parseInt(scanner.nextLine());
        int cols= Integer.parseInt(scanner.nextLine());
        int[][]matrix = new int[rows][cols];
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            String[]line = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                sum += Integer.parseInt(line[j]);
                matrix[i][j]= Integer.parseInt(line[j]);
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
