package com.kastro;

public class HomeWorkAppLessonSeven {
    public static void main(String[] args) {
        HungryCat[] hungryCats = {
                new HungryCat("Hippo", 60),
                new HungryCat("Peach", 25),
                new HungryCat("Mr.Mur", 15),
                new HungryCat("Barsik", 5)
        };

        Plate plate = new Plate(100);
        plate.info();

        for (int i = 0; i < hungryCats.length; i++) {
            hungryCats[i].eat(plate);
            plate.info();

            if (hungryCats[i].isSatiety()) {
                System.out.println(hungryCats[i].getName() + " сытый");
            } else {
                System.out.println(hungryCats[i].getName() + " голодный :(");
            }
        }
    }
}