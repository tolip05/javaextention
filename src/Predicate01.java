import javax.sql.rowset.Predicate;
import java.util.ArrayList;

public class Predicate01 {
    public static void main(String[] args) {
        String[] a = "The big Kur is My ass".split(" ");
        java.util.function.Predicate<String>checkInUpper = x -> Character.isUpperCase(x.charAt(0));
        ArrayList<String>upper = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (checkInUpper.test(a[i])){
                upper.add(a[i]);
            }
        }
        for (String s : upper) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
