import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Badvance3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>names = new ArrayList<>();
        names.add("Alice");
        names.add("Nikole");
        names.add("Kosta");
        names.add("Pesho");
        names.add("Dimo");
        System.out.println(names.get(2));
        names.remove(0);
        names.remove(1);
        names.remove("Dimo");
        names.addAll(Arrays.asList("Milen","Stoqn"));
        names.add(3,"Silviy");
        names.set(2,"Mike");
        System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s, ",names.get(i));
        }
        System.out.println();
        names.forEach(System.out::println);

    }
}
