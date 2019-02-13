package com.kolodzheieva.intro.part2;

public class DirectionSelector {

    public static void select(int point) {
        if (point == 1) {
            System.out.println("Налево пойдешь, сам умрешь");
        } else if (point == 2) {
            System.out.println("Направо - коня потеряешь");
        } else if (point == 3) {
            System.out.println("Прямо - клад найдешь");
        }
    }

}
