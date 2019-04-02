package com.kolodzheieva.intro.lessons.lesson3;

import java.util.Scanner;

public class AnnualSalary {

    public static int MONTHS_IN_YEAR = 12;
    public static double BONUS = 100;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double monthSalary = in.nextDouble();
        int experience = in.nextInt();

        double annualSalary = calculateSalary(monthSalary, experience);

        System.out.println("Зарплата за год: " + annualSalary);

    }

    public static double calculateSalary(double monthSalary, int experience) {
        double annualSalary = monthSalary * MONTHS_IN_YEAR;

        if (experience >= 10) {
            annualSalary += 500;
        }

        if (experience >= 5 && experience < 10) {
            annualSalary = annualSalary + BONUS;
        }

        return annualSalary;
    }
}
