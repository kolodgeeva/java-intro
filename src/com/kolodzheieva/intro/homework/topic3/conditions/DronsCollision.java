package com.kolodzheieva.intro.homework.topic3.conditions;

import static java.lang.Math.*;

public class DronsCollision {

    public static boolean isCollisionHappen(double x1, double y1, double r1,
                                            double x2, double y2, double r2) {
        //расстояние между центрами окружностей
        double d = sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2), 2));
        return d <= (r1+r2);
    }
}
