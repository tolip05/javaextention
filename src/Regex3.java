import jdk.nashorn.internal.runtime.regexp.joni.Matcher;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "</html>\n" +
                "END\n";
        Pattern p = Pattern.compile("<.+?>");
        java.util.regex.
                Matcher matcher = p.matcher(s);
        while (matcher.find()){
            System.out.print(matcher.group());
        }
        System.out.println();


    }
}
