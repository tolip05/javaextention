package team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,List<Teams>>teams = new HashMap<>();
        int countOfPerson = Integer.parseInt(br.readLine());

        while (countOfPerson-- > 0){
            String[]tokens = br.readLine().split("\\s+");
            Teams team = null;
            switch (tokens.length){
                case 4:
                    team = new Teams(tokens[0],Double.parseDouble(tokens[1]),tokens[2],tokens[3]);
                    break;
                case 5:
                    if (tokens[4].contains("@")){
                        team = new Teams(tokens[0],Double.parseDouble(tokens[1]),tokens[2],tokens[3],tokens[4]);
                    }else{
                        team = new Teams(tokens[0],Double.parseDouble(tokens[1]),tokens[2],tokens[3],Integer.parseInt(tokens[4]));
                    }

                    break;
                case 6:
                    team = new Teams(tokens[0],Double.parseDouble(tokens[1])
                            ,tokens[2],tokens[3],tokens[4],Integer.parseInt(tokens[5]));
                    break;

            }
                 teams.putIfAbsent(team.getDepartament(),new ArrayList<>());
            teams.get(team.getDepartament()).add(team);
        }
        teams.entrySet()
                .stream()
                .sorted((d1,d2) ->
                        Double.compare(d2.getValue().stream().mapToDouble(Teams::getSalary).average()
                        .getAsDouble(),d1.getValue().stream().mapToDouble(Teams::getSalary).average()
                                .getAsDouble())).limit(1).forEach(d ->{
                                    StringBuilder sb =
                                            new StringBuilder(String.format
                                                    ("Highest Average Salary: %s%n",d.getKey()));
                                    d.getValue().stream()
                                            .sorted(Comparator.comparing(Teams::getSalary).reversed())
                                            .forEach(e -> sb.append(e).append(System.lineSeparator()));
            System.out.println(sb.toString());
        });
    }
}
