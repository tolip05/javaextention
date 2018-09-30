import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;

public class Badvance16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String[] names = new String[a];
        for (int i = 0; i < a; i++) {
            String name = scanner.nextLine();
            names[i] = name;
        }
        int[] resultat = encryptName(names);
        Arrays.sort(resultat);
        sist(resultat);

    }

    private static void sist(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static int[] encryptName(String[] names) {
        ArrayList<Character> vowel = new ArrayList<>();
        Collections.addAll(vowel,'a','i','e','u','o');
        int[]result = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            int sum =0;
            for (int j = 0; j < names[i].length(); j++) {
                if (vowel.contains(names[i].charAt(j))){
                    sum += (int)(names[i].charAt(j) * names[i].length());
                }else {
                    sum += (int)(names[i].charAt(j) / names[i].length());
                }
            }
            result[i]= sum;
        }
        return result;
    }
}
