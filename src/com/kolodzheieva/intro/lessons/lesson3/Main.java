package com.kolodzheieva.intro.lessons.lesson3;

import java.util.Scanner;

public class Main {

    private static int someVariable = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

	    float fuelPerKm = in.nextFloat();
	    float dist = in.nextFloat();

        float fuelPerKm1 = in.nextFloat();
        float dist1 = in.nextFloat();

        float fuel1 = calculateFuel(fuelPerKm, dist);
        System.out.println(fuel1);

        float fuel2 = calculateFuel(fuelPerKm1, dist1);
        System.out.println(fuel2);

    }

    public static float calculateFuel(float fuelPerKm, float distance) {
        return fuelPerKm * distance;
    }
}
