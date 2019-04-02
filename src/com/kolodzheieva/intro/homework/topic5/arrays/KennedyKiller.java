package com.kolodzheieva.intro.homework.topic5.arrays;

public class KennedyKiller {

    public static void main(String[] args) {

        double[] suspects = {0.1, 0, 0.2, 0, 0, 0.5, 0, 0, 0, 0.2};
        double maxProbability = 0;
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
