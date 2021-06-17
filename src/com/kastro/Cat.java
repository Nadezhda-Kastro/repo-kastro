package com.kastro;

public class Cat extends Animals {

    public Cat(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance, maxSwimDistance);
    }

    @Override
    public void run(int runDistance) {
        if (runDistance < maxRunDistance) {
            System.out.println("Бегемот пробежал " + runDistance + " м.");

        } else {
            System.out.println("Бегемот может пробежать только " + maxRunDistance + " м.");
        }
    }

    @Override
    public void swim(int swimDistance) {

        System.out.println("Бегемот не умеет плавать!");
    }
}

