package com.kolodzheieva.intro.lessons.lesson6;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {

        int[] array = {1000, 2000, 30000, 2000, 10000};

        int sum = 0;
        for (int number: array) {
            sum += number;
            System.out.println(number);
        }
        System.out.println(sum);
    }

}
