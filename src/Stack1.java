import java.util.ArrayDeque;
import java.util.Deque;

public class Stack1 {
    public static void main(String[] args) {
        Deque<Integer>stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pollLast());
    }
}
