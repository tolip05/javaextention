package shoping_spree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product>bagOfProducts;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public boolean hasEnaughMoney(double money){
        return this.money >= money;
    }
    public void byProduct(Product product){
        this.money -= product.getCost();
        this.bagOfProducts.add(product);
    }

    private void setMoney(double money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
           throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",this.name,this.bagOfProducts.size() == 0 ?
         "Nothing bought" : this.bagOfProducts.stream().map(Product::getName)
                .collect(Collectors.joining(", ")));
    }
}
