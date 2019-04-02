package com.kolodzheieva.intro.lessons.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CharTest {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = {"bomb", "gun", "explode"};
        String message = reader.readLine();

        for (String w: words) {
            if (message.toLowerCase().contains(w)) {
                System.out.println("Сдать в СБУ!");
            }
        }


    }

    public static void printAlphabet1() {
        for (char i = 'А'; i <= 'Я'; i++) {
            System.out.print(i);
        }
    }

    public static void printAlphabet() {
        for (int i = 0; i < 32; i++) {
            char big = (char) ('А' + i);
            char small = (char) ('а' + i);
            System.out.print(big + "" + small + ", ");
        }
    }

    public static void printN() {
        char a = 'a';
        char b = 'b';
        char n = '\n';
        char t = '\t';
        System.out.println("" + a + n + t + t + t + b);
    }

    public static void isLatin() {

        String word = "Mariana";
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                System.out.println(chars[i]);
            }
        }

    }
}
