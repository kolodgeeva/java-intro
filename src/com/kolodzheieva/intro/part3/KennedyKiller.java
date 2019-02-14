package com.kolodzheieva.intro.part3;

public class KennedyKiller {

    public static void main(String[] args) {

        int[] suspects = {9, 2, 3, 5, 7, 8, 1, 3, 4, 200};
        int maxProbability = 0;
        int index = -1;
        for (int i = 0; i < suspects.length; i++) {
            if (suspects[i] > maxProbability) {
                maxProbability = suspects[i];
                index = i;
            }
        }
        System.out.println("Killer is " + index + ". Probability = " + maxProbability);
    }

}
