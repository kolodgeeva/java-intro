package com.kolodzheieva.intro.lessons.lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int month = scanner.nextInt();
            switch (month) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Нет такого месяца");
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Введите число");
        }


    }

}
