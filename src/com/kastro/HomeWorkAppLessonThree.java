package com.kastro;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HomeWorkAppLessonThree {
    public static void main(String[] args) {
        getNumbers1(); //задание 1
        getNumbers2(); //задание 2
        getNumbers3(); //задание 3
        arraysTwo(); //задание 4
        getNumbers5(2, 5); //задание 5
    }

    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */
    static int[] getNumbers1() {
        int[] numbers1 = new int[]{0, 1, 1, 0, 1};

        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == 0) {
                numbers1[i] = 1;
            } else if (numbers1[i] == 1) {
                numbers1[i] = 0;
            }
            System.out.print("[" + numbers1[i] + "]");
        }
        System.out.println();

        return numbers1;
    }

    /*2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */

    private static int[] getNumbers2() {
        int[] numbers2 = new int[100];

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i;
            System.out.println(numbers2[i]);
        }

        return numbers2;
    }

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static int[] getNumbers3() {
        int[] numbers3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] < 6) {
                numbers3[i] = numbers3[i] * 2;
            }
            System.out.print("[" + numbers3[i] + "]");
        }
        System.out.println();

        return numbers3;
    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    то есть [0][0], [1][1], [2][2], …, [n][n];

     */

    static int[][] arraysTwo() {
        //int[][] array = new int[3][3];
        int[][] array = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}

        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }

                System.out.println("[" + i + "][" + j + "]" + array[i][j]);

            }

        }
        return array;

    }


    /*5. Написать метод, принимающий на вход два аргумента:
    len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    private static int[] getNumbers5(int len, int initialValue) {
        int[] numbers5 = new int[len];

        for (int i = 0; i < numbers5.length; i++) {
            numbers5[i] = initialValue;
            System.out.println(numbers5[i]);
        }

        return numbers5;
    }
}



