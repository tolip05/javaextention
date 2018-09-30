package shoping_spree1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> bagOfProduct;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.bagOfProduct = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public boolean hasEnaughMoney(double cost) {
       return this.money >= cost;
    }

    public void byProduct(Product product) {
        this.money -= product.getCost();
        this.bagOfProduct.add(product);
    }

    @Override
    public String toString() {

        return String.format("%s - %s",this.name
                ,this.bagOfProduct.size() == 0 ? "Nothing bought":
        bagOfProduct
                .stream().map(Product::getName).collect(Collectors.joining(", ")));
    }
}
