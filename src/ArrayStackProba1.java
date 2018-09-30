import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayStackProba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        ArrayDeque<Character>stack = new ArrayDeque<>();
        for (int i = 0; i < name.length(); i++) {
            stack.push(name.charAt(i));
        }
        String second ="";

        while (!stack.isEmpty()){
            second += stack.pop();
        }
        boolean a = true;
        if (second.equals(name)){
            System.out.println(a);
        }else{
            System.out.println(!a);
        }

    }
}
