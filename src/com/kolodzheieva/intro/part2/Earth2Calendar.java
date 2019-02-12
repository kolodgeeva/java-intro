package com.kolodzheieva.intro.part2;

public class Earth2Calendar {

    public static int daysPast(int day, int month, int year) {
        int daysInMonth = 42;
        int monthsInYear = 10;

        return (day - 1) + ((month - 1) * daysInMonth) + ((year - 1) * monthsInYear * daysInMonth);
    }
}
