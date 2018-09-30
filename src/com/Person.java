package com;

import com.banksId.BankAcaunt;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<BankAcaunt> bankAccaunts;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, List<BankAcaunt> bankAccaunts) {
        this(name,age);
        this.bankAccaunts = bankAccaunts;
    }
    public double getBalance(){
        double sum = 0.0;
        for (BankAcaunt bankAccaunt : bankAccaunts) {
            sum += bankAccaunt.getBalance();
        }
        return sum;
    }
}
