package com.kolodzheieva.intro.lessons.lesson4;

import java.util.Scanner;

public class BoxJumper {

    private static final int LENGTH = 100;
    private static final int HEIGHT1 = 20;
    private static final int HEIGHT2 = 60;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int boxHeight = scanner.nextInt();
        int boxLength = scanner.nextInt();

        int boxHeight2 = scanner.nextInt();
        int boxLength2 = scanner.nextInt();

        if (isOn(boxHeight, boxLength) && isOn(boxHeight2, boxLength2)) {
            System.out.println("Перепрыгнул");
        } else {
            System.out.println("Тупая железяка!!!");
        }



    }

    private static boolean isOn(final int boxHeight, final int boxLength) {
        return boxHeight <= HEIGHT2 || (boxHeight <= HEIGHT1 && boxLength <= LENGTH);
    }


}
