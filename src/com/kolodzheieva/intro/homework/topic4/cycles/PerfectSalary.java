package com.kolodzheieva.intro.homework.topic4.cycles;

public class PerfectSalary {

    public static int getWorkingDays() {
        int maxAmount = 1000000;
        int overallAmount = 1;
        int amountPerDay = 1;
        int coef = 3;
        int days = 1;
        while (overallAmount < maxAmount) {
            days++;
            amountPerDay *= coef;
            overallAmount += amountPerDay;
            System.out.println("day: " + days);
            System.out.println("amount per day: " + amountPerDay);
            System.out.println("overall: " + overallAmount);
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println(getWorkingDays());
    }

}
