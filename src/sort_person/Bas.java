package sort_person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Team team = new Team("Botev");

        for (int i = 0; i < n; i++) {
            String[]input = br.readLine().split(" ");
            try{
            Person person =
                    new Person(input[0]
                            ,input[1]
                            ,Integer.parseInt(input[2]),Double.parseDouble(input[3]));
            team.addPlayer(person);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("Fearst team have %d players",team.getFirstTeam().size());
        System.out.println();
        System.out.printf("Reserve team have %d players",team.getReserveTeam().size());
    }
}
