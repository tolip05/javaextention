import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set guest = new HashSet();
        Scanner scanner = new Scanner(System.in);
        String gost = scanner.nextLine();
        while (!gost.equalsIgnoreCase("party")){
            guest.add(gost);
            gost = scanner.nextLine();
        }
        gost = scanner.nextLine();
        while (!gost.equalsIgnoreCase("end")){
            guest.remove(gost);
            gost = scanner.nextLine();
        }
        for (Object o : guest) {
            System.out.println(o);
        }
    }
}
