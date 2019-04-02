package com.kolodzheieva.intro.homework.topic6.strings;

public class EncryptUnicodeString {

    public static void main(String[] args) {

        String str = "I like it wow";
        String encrypted = "";
        int delta = 4;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                char newC = (char) (c + delta);
                if (c <= 'Z' && c >= 'Z' - delta + 1 || c <= 'z' && c >= 'z' - delta + 1) {
                    newC -= 26;
                }
                encrypted += newC;
            } else {
                encrypted += c;
            }
        }

        System.out.println(encrypted);
        String decrypted = "";

        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                char newC = (char) (c - delta);
                if (c >= 'A' && c <= 'A' + delta - 1 || c >= 'a' && c <= 'a' + delta - 1) {
                    newC += 26;
                }
                decrypted += newC;
            } else {
                decrypted += c;
            }

        }

        System.out.println(decrypted);

    }
}
