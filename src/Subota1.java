import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;



public class Subota1 {
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer>stack = new ArrayDeque<>();
        int maxEl = Integer.MIN_VALUE;

        for (int i = 0; i < number; i++) {
            String []command = scanner.nextLine().split(" ");
            if (command[0].equals("1")){
                int current = Integer.parseInt(command[1]);
                stack.push(current);
                if (maxEl < current){
                    maxEl = current;
                }
            }
            else if(command[0].equals("2")){
                int poppedEl = stack.pop();
                if (maxEl == poppedEl) {
                    maxEl = fineMax(stack);
                }
            }else{
                System.out.println(maxEl);
            }
        }
    }

    private static int fineMax(ArrayDeque<Integer> stack) {
        int max = Integer.MIN_VALUE;
        for (Integer integer : stack) {
            if (integer > max){
                max = integer;
            }
        }
        return max;
    }

}
