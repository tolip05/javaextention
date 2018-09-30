import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([a-z-A-Z !])\\1*");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            input = input.replaceAll(matcher.group(),matcher.group(1));
        }
        System.out.println(input);
    }
}