package animal_food;

public class Main {
    public static void main(String[] args) {
        Predator predator = new Predator();
        predator.eatAll(new Food[]{new Food(),new Food()});
        predator.eat(new Food());
        System.out.println();
    }
}
