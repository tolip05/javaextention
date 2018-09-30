package emps1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int coutOfEmployers = Integer.valueOf(br.readLine());
        Map<String,List<Employe1>>employesByDepartment = new HashMap<>();
        while (coutOfEmployers-- > 0){

            String[] tokens = br.readLine().split("\\s+");
            Employe1 emplyee = null;
            switch (tokens.length){
                case 4:
                    emplyee =
                            new Employe1(tokens[0],Double.parseDouble(tokens[1]),tokens[2],tokens[3]);
                    break;
                case 5:
                    if (tokens[4].contains("@")){
                        emplyee = new Employe1(tokens[0]
                                ,Double.parseDouble(tokens[1]),tokens[2],tokens[3],tokens[4]);
                    }else{
                        emplyee = new Employe1(tokens[0]
                                ,Double.parseDouble(tokens[1]),tokens[2],tokens[3],Integer.parseInt(tokens[4]));
                    }
                    break;
                case 6:
                    emplyee =
                            new Employe1(tokens[0],Double.parseDouble(tokens[1])
                                    ,tokens[2],tokens[3],tokens[4],Integer.parseInt(tokens[5]));
                    break;
            }
            String departament = emplyee.getDepartment();
            if (!employesByDepartment.containsKey(departament)){
                employesByDepartment.put(departament,new ArrayList<>());
            }
            employesByDepartment.get(departament).add(emplyee);
        }
        employesByDepartment.entrySet().stream()
                .sorted((d1,d2) -> Double.compare(d2.getValue().stream().mapToDouble(Employe1::getSalary)
                        .average().getAsDouble(),d1.getValue().stream().mapToDouble(Employe1::getSalary)
                        .average().getAsDouble()))
                .limit(1)
                .forEach(d ->{
                    StringBuilder sb = new StringBuilder(String.format("Highest Average Salary: %s%n",
                            d.getKey()));
                    d.getValue().stream()
                            .sorted(Comparator.comparing(Employe1::getSalary).reversed())
                            .forEach(e -> sb.append(e).append(System.lineSeparator()));
                    System.out.println(sb.toString());
                });
    }
}
