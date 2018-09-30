import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "    Sorry brat    ";
        String clean = s.trim();

        String ss = "C# is the best";
        boolean s1 = ss.startsWith("Java");
        String sas = "How are you?";
        boolean s2 = sas.endsWith("?");

        String email = "kosta1980@abv.bg";
        int firstIndex = email.indexOf("1980");
        int noneIndex = email.indexOf('@',10);
        int last = email.lastIndexOf('a');
        System.out.println(last);
        System.out.println(noneIndex);
        System.out.println(firstIndex);
        System.out.println(s2);
        System.out.println(s1);
        System.out.println(clean);
        System.out.println(s);
    }
}
