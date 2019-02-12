package com.kolodzheieva.intro.part2;

public class Exchanger {

    public static double uahToUsd(double amount) {
        double rate = 0.037;
        return amount * rate;
    }

    public static double usdToUah(double amount) {
        double rate = 27.22;
        return amount * rate;
    }

}
