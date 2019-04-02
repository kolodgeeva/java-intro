package com.kolodzheieva.intro.homework.topic4.cycles;

import java.util.Scanner;

public class TuringTest {

    public static void main(String[] args) {

        int number = 7;
        int userNumber = 0;

        Scanner scanner = new Scanner(System.in);

        while (userNumber != number) {
            System.out.print("Input the number from 1 to 10:");
            userNumber = scanner.nextInt();

            if (userNumber < number) {
                System.out.println("Bigger");
            } else if (userNumber > number) {
                System.out.println("Less");
            } else {
                System.out.println("You bet!");
            }
        }
    }

}
