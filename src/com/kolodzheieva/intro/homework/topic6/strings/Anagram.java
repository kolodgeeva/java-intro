package com.kolodzheieva.intro.homework.topic6.strings;

public class Anagram {

    public static void main(String[] args) {
        String[] strings = {"aaa", "aba", "baa", "ab", "a"};

        System.out.println(isAnagram(strings[0], strings[2]));
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] counters1 = new int[26];
        int[] counters2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            int pos = str1.charAt(i) - 'a';
            counters1[pos]++;

            int pos2 = str2.charAt(i) - 'a';
            counters2[pos2]++;
        }

        for (int i = 0; i < counters1.length; i++) {
            if (counters1[i] != counters2[i]) {
                return false;
            }
        }
        return true;
    }
}
