package com.kastro;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords(); //задание 2
        checkSumSign(); //задание 3
        printColor(); //задание 4
        compareNumbers(); //задание 5
    }

    private static void printThreeWords() {
        System.out.println("_Orange\n_Banana\n_Apple");
    }

    private static void checkSumSign() {
        int a = 4;
        int b = 11;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 115;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 1 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 21;
        int b = 05;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}