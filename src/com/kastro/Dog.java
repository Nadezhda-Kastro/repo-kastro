package com.kastro;

public class Dog extends Animals {
    /*3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

     */

    public Dog(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance, maxSwimDistance);
    }

    @Override
    public void run(int runDistance) {
        if (runDistance < maxRunDistance) {
            System.out.println("Марс пробежал " + runDistance + " м.");

        } else {
            System.out.println("Марс может пробежать только " + maxRunDistance + " м.");
        }
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance < maxSwimDistance) {
            System.out.println("Марс проплыл " + swimDistance + " м.");

        } else {
            System.out.println("Марс может проплыть только " + maxSwimDistance + " м.");
        }
    }
}
