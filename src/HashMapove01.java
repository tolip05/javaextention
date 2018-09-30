import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class HashMapove01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < counter; i++) {
            String[] p = scanner.nextLine().split(" ");
            people.put(p[0],Integer.valueOf(p[1]));
        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();
        Predicate<Integer> tester = createTester(condition,age);
        Consumer<Map.Entry<String,Integer>>printer = createPrinter(format);
        printStudent(people,tester,printer);

    }

    private static void printStudent(Map<String, Integer> people,
                                     Predicate<Integer> tester,
                                     Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> person : people.entrySet()) {
            if (tester.test(people.get(person.getKey()))){
                printer.accept(person);
            }
        }
    }

    private static Consumer<Map.Entry<String,Integer>> createPrinter(String format) {
        switch (format){
            case "name":
                return person -> System.out.printf("%s%n",person.getKey());
            case "age":
                return person -> System.out.printf("%d%n",person.getValue());
            case "name age":
                return person -> System.out.printf("%s - %d%n",person.getKey(),person.getValue());
                default:
                    return null;
        }

    }

    private static Predicate<Integer> createTester(String condition, int age) {
        switch (condition){
            case "younger":
                return x -> x < age;
            case "older":
                return x -> x >= age;
                default:
                    return null;
        }
    }
}
