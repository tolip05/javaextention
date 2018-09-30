import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SemanticHTML1 {
    public static void main(String[] args) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String input = br.readLine();
            if ("END".equalsIgnoreCase(input)){
                break;
            }
            lines.add(input);
        }
        Pattern pattern = Pattern.compile("<div\\s+.*(?<forRemoove>(class|id)\\s*=\\s*\"(?<target>[a-z]+)\").*");
        Pattern pattern1 = Pattern.compile("<\\/div>\\s+<!--\\s*(?<targets>[a-z]+)\\s*-->");
        for (int i = 0; i < lines.size(); i++) {
            Matcher matcher = pattern.matcher(lines.get(i));
            Matcher matcher1 = pattern1.matcher(lines.get(i));
            if (matcher.find()){
                String newLine = lines.get(i).replace("<div","<" + matcher.group("target"))
                        .replace(matcher.group("forRemoove"),"");
                lines.set(i,newLine);
            }
            if (matcher1.find()){
                String newLine = lines.get(i)
                        .replace(matcher1.group(),"</" + matcher1.group("targets")+">");
                lines.set(i,newLine);
            }
        }
        for (String line : lines) {
            System.out.println(line.replaceAll("\\s+"," ")
            .replaceAll("\\s+>",">"));
        }
    }
}
