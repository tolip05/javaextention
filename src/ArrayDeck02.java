import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDeck02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] sas = scanner.nextLine().split(" ");
        ArrayDeque<String>stack = new ArrayDeque<>();
        Collections.addAll(stack,sas);

        while (stack.size()>1){
            Integer first = Integer.valueOf(stack.pop());
            String element = stack.pop();
            Integer second = Integer.valueOf(stack.pop());
            if (element.equals("+")){
                stack.push(String.valueOf(first + second));
            }else{
                stack.push(String.valueOf(first - second));
            }
        }
        System.out.println(stack.pop());
    }
}
