package com.kolodzheieva.intro.part4;

public class FindArraySorted {

    public static void main(String[] args) {

        //int[] numbers = {1, 0, 3, 0, 5, 0, 0, 0, 10};
        int[] numbers = {10, 2, 3, 4, 2};
        printLongestIncreasingSubsequence(numbers);
    }

    public static void printLongestIncreasingSubsequence(int[] arr) {

        int maxLength;
        int startIndex;

        int start = startIndex = 0;
        int length = maxLength = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                length++;
            } else {
                if (length > maxLength) {
                    maxLength = length;
                    startIndex = start;
                }
                length = 1;
                start = i;
            }
        }

        for (int i = startIndex; i < startIndex + maxLength; i++) {
            System.out.println(arr[i]);
        }
    }

}
