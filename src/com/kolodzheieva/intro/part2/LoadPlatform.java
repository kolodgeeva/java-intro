package com.kolodzheieva.intro.part2;

public class LoadPlatform {

    public static boolean canBeLoaded(double length, double width, double height, double weight) {

        int platformLength = 100;
        int platformWidth = 100;
        int platformWeightCapacity = 1000;

        return (length <= platformLength || length <= platformWidth)
                && (width <= platformWidth || width <= platformLength)
                && weight <= platformWeightCapacity;
    }
}
