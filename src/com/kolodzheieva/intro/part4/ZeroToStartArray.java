package com.kolodzheieva.intro.part4;

public class ZeroToStartArray {

    public static void main(String[] args) {

        int[] numbers = {1, 0, 3, 0, 5, 0, 0, 0, 10};
        int current = 0;

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                swap(numbers, current++, i);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    public static void swap(int [] arr, int pos1, int pos2) {
        int temp = arr[pos2];
        arr[pos2] = arr[pos1];
        arr[pos1] = temp;
    }
}
