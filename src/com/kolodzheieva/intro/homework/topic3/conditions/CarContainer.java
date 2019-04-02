package com.kolodzheieva.intro.homework.topic3.conditions;

public class CarContainer {

    public static double carsCount(double length, double height, double width) {
        double containerLength = 10;
        double containerHeight = 4;
        double containerWidth = 2.5;

        if (length <= containerLength && height <= containerHeight && width <= containerWidth ) {
            int carsByLength = (int) (containerLength / length);
            int carsByHeight = (int) (containerHeight / height);
            int carsByWidth = (int) (containerWidth / width);

            return carsByHeight * carsByLength * carsByWidth;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(carsCount(10, 2, 2.5));
    }

}
