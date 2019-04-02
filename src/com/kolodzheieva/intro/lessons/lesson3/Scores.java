package com.kolodzheieva.intro.lessons.lesson3;

import java.util.Scanner;

public class Scores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int score = in.nextInt();
        double money = calculateMoney(score);
        System.out.println(money);
    }

    public static double calculateMoney(int score) {
        if (score >= 1000) {
            return 50000;
        } else if (score >= 500) {
            return 20000;
        } else if (score >= 100) {
            return 10000;
        } else {
            return 0;
        }
    }
}
