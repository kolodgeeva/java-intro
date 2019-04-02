package com.kolodzheieva.intro.lessons.lesson3;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Как тебя зовут? >>>>");
        String name = in.next();
        System.out.println("Тебя зовут " + name);

        System.out.println("Сколько тебе лет? >>>>");
        int age = in.nextInt();
        System.out.println("Тебе " + age);

    }

}
