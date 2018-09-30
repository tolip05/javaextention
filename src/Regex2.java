import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "Abraham Lincoln";
        Pattern p = Pattern.compile("[AaIiOo]");
        Matcher matcher = p.matcher(a);
        int count = 0;
        while (matcher.find()){
            count ++;
        }
        System.out.println(count);
        String s = scanner.nextLine();
        Pattern p1 = Pattern.compile("([A-Za-z])\\1*");
        Matcher matcher1 = p1.matcher(s);
        while (matcher1.find()){
            System.out.print(matcher1.group(1));
        }
        System.out.println();
    }
}
