package com.kolodzheieva.intro.homework.topic6.strings;

public class EncryptString {

    public static void main(String[] args) {

        String str = "java-2019";
        char[] table = {'a', 'b', 'c', 'd', 'e', 'f', 'j', 'v', '-', '0', '1', '2', '3', '4', '9'};
        String encrypted = "";
        int delta = 5;
        int newCharIndex;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < table.length; j++) {
                if(str.charAt(i) == table[j]) {
                    newCharIndex = j + delta;
                    if (j > table.length - delta - 1) {
                        newCharIndex -= table.length;
                    }
                    encrypted += table[newCharIndex];
                }
            }
        }

        System.out.println(encrypted);

    }
}
