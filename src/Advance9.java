import java.util.Scanner;

public class Advance9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []input = scanner.nextLine().split(", ");
        int[][]numbers = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int row = 0; row < numbers.length; row++) {
            String []remainder = scanner.nextLine().split(", ");
            for (int col = 0; col < numbers[0].length; col++) {
                numbers[row][col] = Integer.parseInt(remainder[col]);
            }
        }
        System.out.println(numbers.length);
        System.out.println(numbers[0].length);
        int sum = 0;
        for (int[] number : numbers) {
            for (int i : number) {
              sum +=i;
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
