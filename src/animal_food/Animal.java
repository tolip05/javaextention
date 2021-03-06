package animal_food;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private List<Food> foodEaten;

    public Animal() {
        this.foodEaten = new ArrayList<>();
    }
    public void eat(Food food){
        this.foodEaten.add(food);
    }
    public void eatAll(Food[]foods){
        for (Food food : foods) {
            this.eat(food);
        }
    }
}
