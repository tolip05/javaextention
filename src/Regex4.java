import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []s = scanner.nextLine().toLowerCase().split("");
        StringBuilder as = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            as.append(s[i]);
        }
        String target = scanner.nextLine();

        Pattern p = Pattern.compile(target);
        Matcher matcher = p.matcher(as);
        int count = 0;
        while (matcher.find()){
            count ++;
        }
        System.out.println(count);
    }
}
