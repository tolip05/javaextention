import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("('|\")(.+?)\\1");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){
            System.out.println(matcher.group(2));
        }
    }
}
