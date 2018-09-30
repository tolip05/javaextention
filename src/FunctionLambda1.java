import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionLambda1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,Integer>people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            people.put(input[0],Integer.parseInt(input[1]));
        }
        String condition = scanner.nextLine();
        Integer age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();


        Predicate<Integer>tester = createTester(condition,age);

        Consumer<Map.Entry<String,Integer>>printer = createPrinter(format);

        printFilteretStudent(people,tester,printer);
    }

    private static void printFilteretStudent(LinkedHashMap<String, Integer> people
            , Predicate<Integer> oldOrYanger
            , Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String,Integer> person: people.entrySet()) {
             if (oldOrYanger.test(people.get(person.getKey()))){
                 printer.accept(person);
             }
        }
    }

    private static Consumer<Map.Entry<String,Integer>> createPrinter(String format) {
         switch (format){
             case "name":
                 return person -> System.out.printf("%s%n",person.getKey());
             case "age":
                 return person -> System.out.printf("%s%n",person.getValue());
             case "name age":
                 return person -> System.out.printf("%s - %d%n",person.getKey(),person.getValue());
                 default:
                     return null;
         }
    }

    private static Predicate<Integer> createTester(String condition, Integer age) {
           switch (condition){
               case "yonger":
                   return x -> x < age;
               case "older":
                   return x -> x >= age;
                   default:
                       return null;
           }
    }
}
