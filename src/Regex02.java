import jdk.nashorn.internal.runtime.regexp.joni.Matcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("\\d+");
        java.util.regex.Matcher matcher = pattern.matcher(br.readLine());
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
