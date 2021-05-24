package com.kastro;

public class HomeWorkAppLessonTwo {
    public static void main(String[] args) {
        System.out.println(test1(10,20)); //задание 1

        test2(-15); //задание 2

        System.out.println(test3(-78)); //задание 3

        test4(5,"Привет, Андрей!");
       // test41(2,"Привет"); вариант 4 задания
       // test42(10,"Приветули"); вариант 4 задания

        System.out.println(test5(2403)); //задание 5
    }

    static boolean test1(int number1, int number2) {
        int n3 = number1 + number2;
        if (n3 >= 10 && n3 <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void test2(int t2) {
        if (t2 < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }

    }

    static boolean test3(int t3) {
        if (t3 < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void test4(int t4, String t5) {
        for (int i = 0; i < t4; i++) {
           System.out.println(t5);
        }
    }

   /* варианты задания4

   static void test41(int t4, String t5) {
        while (t4 > 0) {
            System.out.println(t5);
            t4--;
        }
    }

    static void test42(int t4, String t5) {
        int i = 0;
        while (i < t4) {
            System.out.println(t5);
            i++;
        }
    }*/

    static boolean test5(int year) {
        if (((double) year % 400) == 0) {
            return true;
        } else if (((double) year % 100) == 0) {
            return false;
        } else if (((double) year % 4) != 0) {
            return false;
        } else {
            return true;
        }
    }
}
