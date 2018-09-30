import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex05 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2}) (AM|PM)$");

        String line = br.readLine();

        while (!"END".equals(line)){
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()){
                int hour = Integer.parseInt(matcher.group(1));
                int min = Integer.parseInt(matcher.group(2));
                int sec = Integer.parseInt(matcher.group(3));

                if (isValidTime(hour,min,sec)){
                    System.out.println("Valid");
                }else{
                    System.out.println("Invalid");
                }
            }else{
                System.out.println("Invalid");
            }

                line = br.readLine();
        }
    }

    private static boolean isValidTime(int hour, int min, int sec) {
        if (!(0 <= hour && hour <= 12)){
            return false;
        }
        if (!(0<= min && min <=59)){
            return false;
        }
        if (!(0<= sec && sec <= 59)){
            return false;
        }
        return true;
    }
}
