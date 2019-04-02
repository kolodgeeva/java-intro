package com.kolodzheieva.intro.lessons.lesson4;

import java.util.Scanner;

public class WhileTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (long i = 0; i <= 10; i++) {

            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);

        }



    }
}
