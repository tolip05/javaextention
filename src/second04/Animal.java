package second04;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Animal {
    protected List<Food> foods;

    public Animal(List<Food> foods) {
        this.foods = foods;
    }
    public void eat(Food food){
        this.foods.add(food);
    }
    public void eatAll(Food[]f){
        Collections.addAll(foods,f);
        }
    }



