import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Stack2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Deque<Integer>stack = new ArrayDeque<>();
        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);
            if (ch == '('){
                stack.push(index);
            }else if (ch == ')'){
                System.out.println(s.substring(stack.pop(),index + 1));
            }
        }
    }
}
