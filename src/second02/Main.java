package second02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().split(" ");
            people.add(new Person(tokens[0],tokens[1],Integer.parseInt(tokens[2]),
                    Double.parseDouble(tokens[3])));

        }
        double bonus = Double.parseDouble(br.readLine());
        for (Person person : people) {
            person.IncreaseSalary(bonus);
            System.out.println(person.toString());
        }
        
    }
}
