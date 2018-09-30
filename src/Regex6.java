import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("(?<=[\\/\\\\() ]|^)[a-zA-Z][a-zA-Z0-9_]{2,25}(?=[\\/\\\\() ]|$)");
        String input = scanner.nextLine();
        Matcher matcher = p.matcher(input);
        List<String> names = new ArrayList<>();
        while (matcher.find()){
            names.add(matcher.group());
        }
        int firstIndex = 0;
        int maxLenght = -1;
        for (int i = 0; i < names.size()-1; i++) {
            int curent = names.get(i).length() + names.get(i +1).length();
            if (curent > maxLenght){
                maxLenght = curent;
                firstIndex = i;
            }
        }
        System.out.println(names.get(firstIndex));
        System.out.println(names.get(firstIndex + 1));
    }
}
