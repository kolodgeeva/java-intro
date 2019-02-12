package com.kolodzheieva.intro.part2;

public class PathCounter {

    public static void count(int overallPath) {
        int first = overallPath /  100;
        int second = (overallPath - first * 100) / 10;
        int third = (overallPath - first * 100 - second * 10) % 10;
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);

        System.out.println(first + second + third);
    }
}
