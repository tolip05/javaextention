package second01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().split("\\s+");
            people.add(new Person(tokens[0],tokens[1],Integer.parseInt(tokens[2])));
        }
        Collections.sort(people,(firstPerson,secondPerson) ->{
            int s = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
            if (s != 0){
                return s;
            }else{
                return Integer.compare(firstPerson.getAge(),secondPerson.getAge());
            }
        });
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
