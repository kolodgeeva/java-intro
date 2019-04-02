package com.kolodzheieva.intro.lessons.lesson5;

import java.util.Scanner;

public class MaxArrays {

    public static void main(String[] args) {

//        int[] numbers = fillIntArray(5);
//        int max = max(numbers);
//        System.out.println(max);

//        int[] numbers = fillIntArray(4);
//        printReverseArray(numbers);


        String[] strings = fillStringArray(3);
        int[] numbers = new int[3];

        for (int i = 0; i < strings.length; i++) {
            numbers[i] = strings[i].length();
        }

        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void printArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static int[] fillIntArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static String[] fillStringArray(int size) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[size];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        return strings;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void printReverseArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void printReverseArray(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
