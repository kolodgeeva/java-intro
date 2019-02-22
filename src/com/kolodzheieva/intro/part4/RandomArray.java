package com.kolodzheieva.intro.part4;

public class RandomArray {
    public static void main(String[] args) {
        int[] programs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < programs.length; i++) {
            double random = Math.random();

            //int newIndex = i + (int)(random * (programs.length - i));
            int newIndex = (int)(random * (programs.length - 1));

            int temp = programs[newIndex];
            programs[newIndex] = programs[i];
            programs[i] = temp;
        }

        for (int i = 0; i < programs.length; i++) {
            System.out.print(programs[i] + " ");
        }
    }
}
