package companyRoster;

import com.sun.javafx.collections.MappingChange;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int counOfEmployees = Integer.parseInt(br.readLine());

        Map<String, java.util.List<Employee>>employeeByDepartment = new HashMap<>();

        while (counOfEmployees-->0){

            String[] tokens = br.readLine().split("\\s+");

            Employee employee = null;
            switch (tokens.length){
                case 4:
                    employee = new Employee(tokens[0],Double.parseDouble(tokens[1]),tokens[2],tokens[3]);
                    break;
                case 5:
                    if (tokens[4].contains("@")){
                        employee = new Employee(tokens[0],Double.parseDouble(tokens[1]),tokens[2]
                                ,tokens[3],tokens[4]);
                    }else{
                        employee = new Employee(tokens[0],Double.parseDouble(tokens[1]),tokens[2],tokens[3]
                        ,Integer.parseInt(tokens[4]));
                    }
                    break;
                case 6:
                    employee = new Employee(tokens[0],Double.parseDouble(tokens[1]),tokens[2]
                            ,tokens[3],tokens[4],Integer.parseInt(tokens[5]));
                    break;
            }
            String department = employee.getDepartmen();
            if (!employeeByDepartment.containsKey(department)){
             employeeByDepartment.put(department,new ArrayList<>());
            }
                employeeByDepartment.get(department).add(employee);
        }
        employeeByDepartment.entrySet().stream().sorted((d1,d2) -> Double.compare(d2.getValue().stream()
        .mapToDouble(Employee::getSalary).average().getAsDouble(),
                d1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble())).limit(1)
                .forEach(x -> {
                    StringBuilder sb =
                            new StringBuilder
                                    (String.format("Highest Average Salary: %s%n",
                                            x.getKey()));x.getValue()
                            .stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                            .forEach(e -> sb.append(e).append(System.lineSeparator()));
                    System.out.println(sb.toString());
                });
    }
}
