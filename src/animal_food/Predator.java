package animal_food;

import java.util.List;

public class Predator extends Animal {
    private int health;

    public Predator(List<Food> foodEaten) {
        super();
    }

    public Predator() {

    }

    @Override
    public void eat(Food food){
        super.eat(food);
        this.health++;
    }

}
