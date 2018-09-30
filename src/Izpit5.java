import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Izpit5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("(?<first>[_,])(?<target>[a-zA-Z]+)(?<digit>[0-9])");
        Map<String,String>map = new LinkedHashMap<>();
        while (true){
            String input = br.readLine();
            input = decrypt(input,map);
            if ("Ascent".equalsIgnoreCase(input)){
                break;
            }
            Matcher matcher = pattern.matcher(input);
            while(matcher.find()){
                String mach = matcher.group();
                String firstChar=matcher.group("first");
                int dig = Integer.valueOf(matcher.group("digit"));
                String message = matcher.group("target");
                StringBuilder sb = new StringBuilder();
                if (firstChar.equals("_")){
                    for (int i = 0; i < message.length(); i++) {
                        sb.append((char)(message.charAt(i) - dig));
                    }
                }else{
                    for (int i = 0; i < message.length(); i++) {
                        sb.append((char) (message.charAt(i) + dig));
                    }
                }
                map.put(mach,sb.toString());
                input = input.replaceAll(mach,sb.toString());
            }
            System.out.println(input);
        }
    }

    private static String decrypt(String input, Map<String, String> map) {
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            input = input.replaceAll(stringStringEntry.getKey(),stringStringEntry.getValue());
        }
        return input;
    }
}
