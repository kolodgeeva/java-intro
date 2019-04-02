package com.kolodzheieva.intro.homework.topic5.arrays;

public class EvenOddArray {

    public static void main(String[] args) {
        int[] scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mainScore = 0;
        int secondScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i % 2 == 0) {
                mainScore += scores[i];
            } else {
                secondScore += scores[i];
            }
        }
        System.out.println("Main score " + mainScore);
        System.out.println("Second score " + secondScore);
    }
}
