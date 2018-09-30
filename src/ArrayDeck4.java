import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDeck4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        ArrayDeque<Integer>stack = new ArrayDeque<>();

        for (int index = 0; index < line.length(); index++) {
            char symbol = line.charAt(index);
            if (symbol == '('){
             stack.push(index);
            }else if(symbol == ')'){
                int startIndex = stack.pop();
                String sub = line.substring(startIndex,index + 1);
                System.out.println(sub);
            }

        }
    }
}
