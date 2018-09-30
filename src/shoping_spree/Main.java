package shoping_spree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Person> persons = new LinkedHashMap<>();
        Map<String,Product> products = new LinkedHashMap<>();

        String[] peopoleTokens = br.readLine().split("[;=]");
        String[] productsTokens = br.readLine().split("[;=]");
        try {
            for (int i = 0; i < peopoleTokens.length; i += 2) {

                Person person = new Person(peopoleTokens[i]
                        , Double.parseDouble(peopoleTokens[i + 1]));
                persons.putIfAbsent(person.getName(),person);

            }
            for (int i = 0; i < productsTokens.length; i += 2) {
                Product product = new Product(productsTokens[i],
                        Double.parseDouble(productsTokens[i + 1]));
                products.putIfAbsent(product.getName(),product);
            }
            String line;
            while (true){
                if ("end".equalsIgnoreCase(line = br.readLine())){
                    break;
                }
                String[]purchesTokens = line.split(" ");
                String personName = purchesTokens[0];
                String productName = purchesTokens[1];
                if (persons.containsKey(personName) && products.containsKey(productName)){
                    Person person = persons.get(personName);
                    Product product = products.get(productName);
                    if (person.hasEnaughMoney(product.getCost())){
                       person.byProduct(product);
                        System.out.printf("%s bought %s%n",person.getName(),product.getName());
                    }else{
                        System.out.printf("%s can't afford %s%n",person.getName(),product.getName());
                    }
                }
            }
            persons.values().stream().forEach(System.out::println);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
