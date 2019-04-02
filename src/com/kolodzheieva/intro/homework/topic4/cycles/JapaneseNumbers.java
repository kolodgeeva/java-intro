package com.kolodzheieva.intro.homework.topic4.cycles;

public class JapaneseNumbers {

    public static void printShuttleNumbers() {
        for (int i = 0; i < 100; i++) {
            if (!isNumberContainsDigit(i, 4) && !isNumberContainsDigit(i, 9)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isNumberContainsDigit(int num, int digit) {
        while (num > 0) {
            if (num % 10 == digit)
                return true;
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        printShuttleNumbers();
    }

}
