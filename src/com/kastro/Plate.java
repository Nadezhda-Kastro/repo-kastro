package com.kastro;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        food -= n;
        if (food < 0) {
            food = 0; // Условие не выполнится, потому что при текущей реализации коты проверяют, что могут наесться
        }
    }

    public void increaseFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
