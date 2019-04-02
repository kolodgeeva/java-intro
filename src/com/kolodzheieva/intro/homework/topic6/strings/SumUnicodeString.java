package com.kolodzheieva.intro.homework.topic6.strings;

public class SumUnicodeString {

    public static void main(String[] args) {

        String name = "Марьяна Колоджеева";
        int number = 0;

        for (char ch: name.toCharArray()) {
            number += ch;
        }

        System.out.println(number);

    }
}
