package com.kolodzheieva.intro.homework.topic3.conditions;

public class TrainsCollision {

    public static boolean isCollisionHappen(double firstSpeed, double secondSpeed) {
        int distance = 10;
        int toSidetrackPoint = 4;

        return distance / (firstSpeed + secondSpeed) * firstSpeed >= toSidetrackPoint;
    }
}
