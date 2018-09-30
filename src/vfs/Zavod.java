package vfs;

import java.io.Serializable;

public class Zavod implements Serializable{
    private String name;
    private int age;

    public Zavod() {
    }

    public Zavod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
