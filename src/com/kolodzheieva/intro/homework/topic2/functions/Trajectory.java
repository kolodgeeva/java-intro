package com.kolodzheieva.intro.homework.topic2.functions;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Trajectory {

    public static double distance(double a, double b, double c) {
        double D = pow(b, 2) - (4 * a * c);
        if (D > 0) {
            double x1 = ((-1) * b + sqrt(D)) / (2 * a);
            double x2 = ((-1) * b - sqrt(D)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
            return Math.abs(x1 - x2);
        }
        return -1;
    }
}
