import javafx.beans.binding.StringBinding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Izpit12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String input = br.readLine();
            if (input.equals("burp")){
                break;
            }
            sb.append(input);
        }
         String result = sb.toString().replaceAll("\\s+"," ");
        Pattern pat = Pattern.compile("(\\$|&|'|%)(.+?)(\\1)");
        Matcher matcher = pat.matcher(result);

        sb = new StringBuilder();
        while (matcher.find()){
            switch (matcher.group(1)){
                case "$":
                    String remeinder = matcher.group(2);
                    for (int i = 0; i < remeinder.length(); i++) {
                        char c = remeinder.charAt(i);
                        if (i % 2 == 0){

                            c += 1;
                        }else{
                            c -= 1;
                        }
                    }
                    break;
                    
            }
        }

    }
}
