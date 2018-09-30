package sayHello01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Base>list = new ArrayList<>();
        list.add(new Bulgarian("Kiro"));
        list.add(new Holland("Avram"));

        for (Base base : list) {
            System.out.println(base.sayHello());
        }
    }
}
