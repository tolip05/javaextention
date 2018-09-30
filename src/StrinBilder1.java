import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StrinBilder1 {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("1234567");
//        sb.insert(4,"sas");
//        sb.delete(0,2);
//        sb.reverse();
//        System.out.println(sb.toString());
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        Character[] b = new Character[a.length()];
        StringBuilder sb = new StringBuilder();
        List<Character> sas = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            sas.add(a.charAt(i));
            //sb.append(a.charAt(i));
        }

        //sas.add(b[0]);



        for (Character sa : sas) {
            sb.append(sa);
        }
        System.out.println(sb.toString());
    }
}
