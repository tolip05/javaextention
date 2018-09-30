package second03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Team team = new Team("Botev");
        int n = Integer.parseInt(br.readLine());
        //List<Person> people = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] tokens = br.readLine().split(" ");
                try {
                    Person person = new Person(tokens[0], tokens[1]
                            , Integer.parseInt(tokens[2]), Double.parseDouble(tokens[3]));
                    team.addPlayer(person);
                }catch (IllegalArgumentException iea){
                    System.out.println(iea.getMessage());
                }
            }
        System.out.printf("First team have %d players%n",team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n",team.getReserveTeam().size());
           // double bonus = Double.parseDouble(br.readLine());

//            for (Person person : people) {
//                person.increaseSalary(bonus);
//                System.out.println(person.toString());
//            }
    }
}
