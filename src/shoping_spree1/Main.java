package shoping_spree1;

import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String,Person> people = new LinkedHashMap<>();
        Map<String,Product> products = new LinkedHashMap<>();

        String[]peopleTokens = br.readLine().split("[=;]");
        String[]productTokens = br.readLine().split("[=;]");

        try{
            for (int i = 0; i < peopleTokens.length; i+=2) {
                Person person = new Person(peopleTokens[i]
                        ,Double.parseDouble(peopleTokens[i + 1]));
                people.putIfAbsent(person.getName(),person);
            }
            for (int i = 0; i < productTokens.length; i += 2) {
                Product product = new Product(productTokens[i],
                        Double.parseDouble(productTokens[i + 1]));
                products.putIfAbsent(product.getName(),product);
            }
            String line;
            while (true){
                if ("end".equalsIgnoreCase(line = br.readLine())){
                    break;
                }
                String[] purchesTokens = line.split(" ");
                String personName = purchesTokens[0];
                String productName = purchesTokens[1];
                if (people.containsKey(personName) && products.containsKey(productName)){
                    Person person = people.get(personName);
                    Product product = products.get(productName);
                    if (person.hasEnaughMoney(product.getCost())){
                        person.byProduct(product);
                        System.out.printf("%s bought %s%n",person.getName(),product.getName());
                    }else{
                        System.out.printf
                                ("%s can't afford %s%n",person.getName(),product.getName());
                    }
                }
            }
          people.values().forEach(System.out::println);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

    }
}
