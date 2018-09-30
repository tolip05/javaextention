import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDeck01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        ArrayDeque<Character>reversed = new ArrayDeque<>();
        for (Character ch : inputString.toCharArray()) {
            reversed.push(ch);
        }
        while (!reversed.isEmpty()){
            System.out.print(reversed.pop());
        }
        System.out.println();

        ArrayDeque<String>rev = new ArrayDeque<>();
        while (true){
            rev.push(scanner.nextLine());
            if (rev.contains("stop")){
                break;
            }
        }
        String[]sosa = new String[rev.size()];


    }
}
