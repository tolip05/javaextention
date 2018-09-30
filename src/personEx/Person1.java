package personEx;

import dice1.BankAccaunt;

import java.util.ArrayList;
import java.util.List;

public class Person1 {
    private String name;
    private int age;
    private List<BankAccaunt> accaunts;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
        this.accaunts = new ArrayList<>();
    }

    public Person1(String name, int age, List<BankAccaunt> accaunts) {
        this(name,age);
        this.accaunts = accaunts;
    }
}
