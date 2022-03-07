package com.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        /* 1. Вывести на экран числа от 1 до 10, используя цикл while. */

        System.out.println("Вывод чисел от 1 до 10: ");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println();

        /* 2. Вывести на экран числа от 10 до 1, используя цикл while. */

        System.out.println("Вывод чисел от 10 до 1: ");
        i = 10;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        System.out.println();

        /* 3. Ввести с клавиатуры строку и число N.
        Вывести на экран строку N раз, используя цикл while. */

        System.out.println("Хорошего много не бывает, верно?" +
                "\nДавай выведем любую твою фразу столько раз, сколько тебе угодно.");
        System.out.print("Что ты хотел бы вывести? - ");
        int phrase = scan.nextInt();
        System.out.print("Сколько раз вывести эту фразу? - ");
        int n = scan.nextInt();
        i = 1;
        while (i <= n) {
            System.out.println(phrase);
            i++;
        }
        System.out.println();

        /* 4. Вывести на экран квадрат из 10х10 букв S,
        используя цикл while. Буквы в каждой строке не разделять. */

        System.out.println("Квадрат из буквы S:");
        i = 1;
        int j = 1;
        while (i <= 10) {
            while (j <= 10) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }
        System.out.println();

        /* 5. Вывести на экран квадрат из 10х10 букв S,
        используя цикл while. Буквы в каждой строке не разделять. */

        System.out.println("Таблица умножения:");
        i = 1;
        j = 1;
        while (i <= 10) {
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }
    }
}
