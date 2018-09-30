import java.util.Scanner;

public class Advance11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());

        int[][]pascal = new int[height][];

        for (int i = 0; i < height; i++) {
            pascal[i]= new int[i + 1];
        }
        pascal[0][0] = 1;

        for (int row = 0; row < height; row++) {
            pascal[row][0] = 1;
            pascal[row][pascal[row].length - 1] = 1;
            for (int col = 1; col < pascal[row].length - 1; col++) {
                pascal[row][col] = pascal[row - 1][col -1] + pascal[row -1][col];
            }
        }
        for (int[] ints : pascal) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
