package com.kolodzheieva.intro.lessons.lesson8;

import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {

            int newIndex = random.nextInt(numbers.length);

            int temp = numbers[newIndex];
            numbers[newIndex] = numbers[i];
            numbers[i] = temp;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
