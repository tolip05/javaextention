import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Advance5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 444;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        while (a > 1) {
            int r = a % 16;
            a /= 16;
            list.add(r);
            sb.append(r);
        }
        System.out.println(sb.toString());
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            sum.add(list.get(list.size() - i - 1));
        }
        String m = "";
        for (int i = 0; i < sum.size(); i++) {
            if (sum.get(i) == 10) {
                m = "A";
            } else if (sum.get(i) == 11) {
                m = "B";
            } else if (sum.get(i) == 12) {
                m = "C";
            } else if (sum.get(i) == 13) {
                m = "D";
            } else if (sum.get(i) == 14) {
                m = "E";
            } else if (sum.get(i) == 15) {
                m = "F";
            } else {
                 m = sum.get(i).toString();
            }
            //System.out.print(m);


        }
    }
}

