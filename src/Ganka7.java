import java.util.Scanner;

public class Ganka7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
        String open = "<upcase>";
        String closed = "</upcase>";

        while (s.contains(open)){
            int startIndex = s.indexOf(open);
            int endIndex = s.indexOf(closed);
            String forReplace = s.substring(startIndex + open.length(),endIndex);
            String uperCase = forReplace.toUpperCase();
            s = s.replaceFirst(forReplace,uperCase);
            s = s.replaceFirst(open,"");
            s = s.replaceFirst(closed,"");
        }
        System.out.println(s);
    }
}
