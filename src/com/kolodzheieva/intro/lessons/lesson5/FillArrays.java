package com.kolodzheieva.intro.lessons.lesson5;

import java.util.Scanner;

public class FillArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }



    }
}
