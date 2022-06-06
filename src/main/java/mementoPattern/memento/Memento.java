package mementoPattern.memento;

import java.util.ArrayList;

public class Memento {
    int money;
    ArrayList fruits;

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public int getMoney() {
        return money;
    }

    public ArrayList getFruits() {
        return fruits;
    }
}
