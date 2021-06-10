package com.kastro;

public class HomeWorkAppLessonSeven {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Hippo", 60),
                new Cat("Peach", 25),
                new Cat("Mr.Mur", 15),
                new Cat("Barsik", 5)
        };

        Plate plate = new Plate(100);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();

            if (cats[i].isSatiety()) {
                System.out.println(cats[i].getName() + " сытый");
            } else {
                System.out.println(cats[i].getName() + " голодный :(");
            }
        }
    }
}