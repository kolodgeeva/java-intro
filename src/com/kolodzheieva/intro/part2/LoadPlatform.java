package com.kolodzheieva.intro.part2;

public class LoadPlatform {

    public static boolean canBeLoaded(double length, double width, double height, double weight) {

        int platformLengthAndWidth = 100;
        int platformWeightCapacity = 1000;

        return length <= platformLengthAndWidth && width <= platformLengthAndWidth && weight <= platformWeightCapacity;
    }
}
