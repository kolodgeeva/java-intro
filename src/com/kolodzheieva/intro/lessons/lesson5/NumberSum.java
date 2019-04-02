package com.kolodzheieva.intro.lessons.lesson5;

import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int n = scanner.nextInt();
            sum += n;
            if (n == -1) {
                System.out.println(sum);
                break;
            }
        }
    }
}
