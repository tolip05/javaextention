import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Today is 2015-05-11";
        String pat = "(.+)(\\d{4})-(\\d{2})-(\\d{2})";

        boolean reg = Pattern.matches(pat,text);
        Pattern patern = Pattern.compile(pat);
        Matcher matcher = patern.matcher(text);
        if (matcher.find()){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            System.out.println(matcher.group(4));
        }

        System.out.println(reg);
        String andy = "Andy: 123";
        Pattern pattern1 = Pattern.compile("[A-Z][a-z]{3}:\\s[0-9]+");
        Matcher matcher1 = pattern1.matcher(andy);
        System.out.println(matcher1.find());
    }
}
