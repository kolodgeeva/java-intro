package com.kolodzheieva.intro.part4;

public class UniqueArray {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 0, 3, 0, 5, 0, 0, 0, 10};
        int[] temp = new int[numbers.length];
        int current = 0;

        for(int i = 0; i < numbers.length; i++) {
            boolean isDistinct = true;
            for(int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                temp[current++] = numbers[i];
            }
        }

        int[] newNumbers = new int[current];
        for (int i = 0; i < current; i++) {
            newNumbers[i] = temp[i];
        }

        for (int newNumber : newNumbers) {
            System.out.print(newNumber + " ");
        }

    }


}
