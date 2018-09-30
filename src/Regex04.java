import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("^\\w{6,12}$");
        String line = br.readLine();

        while (!"end".equalsIgnoreCase(line)){
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            line = br.readLine();
        }
    }
}
