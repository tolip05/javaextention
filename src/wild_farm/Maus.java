package wild_farm;

public class Maus extends Mammal {


    public Maus(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public String makeSound() {
        return "SQUEEEAAAK!";
    }

    @Override
    public void eat(Food food, int foodQuantity) {
        if (!food.getClass().getSimpleName().equals("Vegetable")){
        throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
        this.setFoodEaten(foodQuantity);
    }


}
