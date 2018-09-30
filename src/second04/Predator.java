package second04;

import java.util.ArrayList;

public class Predator extends Animal{
    private int health;

    public Predator(int health) {
        super(new ArrayList<>());
        this.health = 0;
    }
    @Override
    public void eat(Food food){
        super.eat(food);
        this.health++;
    }

    public int getHealth() {
        return this.health;
    }
}
