import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(scanner.nextLine());
        Matcher matcher = pattern.matcher(scanner.nextLine());

        int counter = 0;
        while (matcher.find()){
            counter++;
        }
        System.out.println(counter);
    }
}
