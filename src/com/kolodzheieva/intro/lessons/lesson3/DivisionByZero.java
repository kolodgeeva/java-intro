package com.kolodzheieva.intro.lessons.lesson3;

import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (c != 0) {
            int result = (a + b) / c;
            System.out.println(result);
        } else {
            System.out.println("Произошла ошибка. Перезапустите программу и не используйте 0 для c");
        }
    }
}
