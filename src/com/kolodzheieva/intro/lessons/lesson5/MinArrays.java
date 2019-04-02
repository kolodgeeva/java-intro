package com.kolodzheieva.intro.lessons.lesson5;

import java.util.Scanner;

public class MinArrays {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 1, 6, 8, 90, 6, 90};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);




    }
}
