package com.kolodzheieva.intro.lessons.lesson3;

import java.util.Scanner;

public class CastleDestroyer {

    public static int start = 1000;
    public static int end = 1500;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int distance = in.nextInt();

        if (isDestroyed(distance)) {
            System.out.println("Попал");
        } else {
            System.out.println("Мазила!");
        }

    }

    public static boolean isDestroyed(int distance) {
        if (distance < start || distance > end) {
            return false;
        } else {
            return true;
        }
    }

}
