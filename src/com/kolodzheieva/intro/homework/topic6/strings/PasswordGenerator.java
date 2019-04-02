package com.kolodzheieva.intro.homework.topic6.strings;

import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digit = "0123456789";
        String special = "_";
        String all = lower + upper + digit + special;
        int size = 8;
        String password = "";
        Random random = new Random();

        password += lower.charAt(random.nextInt(lower.length()));
        password += upper.charAt(random.nextInt(upper.length()));
        password += digit.charAt(random.nextInt(digit.length()));

        for (int i = 0; i < size - 3; i++) {
            password += all.charAt(random.nextInt(all.length()));
        }

        System.out.println(password);
    }


}
