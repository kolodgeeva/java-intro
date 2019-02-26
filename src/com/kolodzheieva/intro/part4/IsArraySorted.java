package com.kolodzheieva.intro.part4;

public class IsArraySorted {

    public static void main(String[] args) {

        //int[] numbers = {1, 0, 3, 0, 5, 0, 0, 0, 10};
        int[] numbers = {1, 2, 3, 4};
        System.out.println(isSorted(numbers));
    }

    public static boolean isSorted(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
