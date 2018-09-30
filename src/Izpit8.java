import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;

public class Izpit8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        java.util.regex.Pattern pat = java.util.regex.Pattern.compile("(\\D+)(\\d+)");
        Matcher matcher = pat.matcher(input);

        Set<Character>set = new HashSet<>();

        while (matcher.find()){
            int count = Integer.valueOf(matcher.group(2));
            String str = matcher.group(1);

            if (count != 0){
                for (int i = 0; i < str.length(); i++) {
                    set.add(str.charAt(i));
                }
            }
            for (int i = 0; i < count; i++) {
                sb.append(str.toUpperCase());
            }
        }
        System.out.println(set.size());
        System.out.println(sb);

    }
}
