import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ArrayDeckUpr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] braces = scanner.nextLine().toCharArray();
        Deque<Character> openBreac = new ArrayDeque<>();
         if (braces.length%2 !=0){
             System.out.println("No");
             return;
         }
        for (char brace : braces) {
            if (brace == '(' || brace == '[' || brace == '{') {
                openBreac.push(brace);
            } else {
                char curentBreac = openBreac.pop();
                if (brace == ')'){
                    brace = '(';
                }
                if (brace == '}'){
                    brace = '{';
                }
                if (brace == ']'){
                    brace = '[';
                }
                if (brace != curentBreac){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
