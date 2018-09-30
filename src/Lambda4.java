import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Lambda4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]s = scanner.nextLine().split(" ");
        Predicate<String>checToUpercase = x -> Character.isUpperCase(x.charAt(0));
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if (checToUpercase.test(s[i])){
                res.add(s[i]);
            }
        }
        System.out.println(res.size());
        for (String re : res) {
            System.out.println(re);
        }
    }
}
