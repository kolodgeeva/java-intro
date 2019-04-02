package com.kolodzheieva.intro.lessons.lesson5;

import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while(n != -1) {
            n = scanner.nextInt();
            sum += n;
            count++;
        }
        System.out.println(sum / count);
    }
}
