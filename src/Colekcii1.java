import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Colekcii1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>names = new ArrayList<>();
        names.add("Pesho");
        Collections.addAll(names,"Gosho","Mariika","Stamat");
        Collections.reverse(names);
        //Collections.sort(names);
        names = modify(names);
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        names.clear();
        System.out.println(names.size());
    }

    private static ArrayList<String> modify(ArrayList<String> names) {
        names.remove(0);
        return names;
    }
}
