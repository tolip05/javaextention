import java.util.Arrays;
import java.util.Scanner;

public class Advance8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][]array = new int[3][4];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = row + col;
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}