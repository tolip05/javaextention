package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String type;
        while (true){
            if ("Beast!".equalsIgnoreCase(type = br.readLine())){
                break;
            }
            String[] tokens = br.readLine().split(" ");
            try{

            Animal animal = getAnimal(type, tokens);
                if (animal == null){
                    System.out.println(ErorMessage.INVALID_INPUT_MESSAGE);
                }else{
                    System.out.println(animal);
                }
            }catch (IllegalArgumentException iea){
                System.out.println(iea.getMessage());
            }

        }
    }

    private static Animal getAnimal(String type, String[] tokens) {
        Animal animal;
        switch (type){
            case "Animal":
                return new Animal(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);

            case "Dog":
                return new Dog(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);

            case "Cat":
                return new Cat(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);

            case "Frog":
                return new Frog(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);

            case "Kitten":
                return new Kitten(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);

            case "Tomcat":
                return new Tomcat(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);

            default:
                return null;
        }
    }
}
