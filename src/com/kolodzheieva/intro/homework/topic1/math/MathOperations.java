package com.kolodzheieva.intro.homework.topic1.math;

import static java.lang.Math.*;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MathOperations {

    /**
     * Площадь и периметр прямоугольника по координатам противоположных вершин
     */
    public static void task7() {
        int y1 = 10;
        int y2 = 20;

        int x1 = 10;
        int x2 = 20;

        int a = y2 - y1;
        int b = x2 - x1;

        int P = 2*(a+b);
        System.out.println(P);

        int S = a*b;
        System.out.println(S);
    }

    /**
     * Теорема косинусов
     * Квадрат стороны равен сумме квадратов двух других сторон за вычетом
     * удвоенного произведения этих сторон на косинус угла между ними
     */
    public static void task8() {
        int a = 10;
        int b = 20;
        int angle = 45;
        double c = sqrt((pow(a, 2) + pow(b, 2)) - 2 * a * b * cos(angle));
        System.out.println(c);
    }

    /**
     * Объем шара * Плотность
     */
    public static void task9() {
        double radius = 10;
        double P = 0.7;

        double V = 4 * PI * pow(radius, 3) / 3;
        System.out.println(V);

        double m = V * P;
        System.out.println(m);
    }

}
