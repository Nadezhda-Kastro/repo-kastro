package com.kastro;

public class HungryCat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public HungryCat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

}
