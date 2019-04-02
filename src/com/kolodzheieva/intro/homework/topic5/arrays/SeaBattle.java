package com.kolodzheieva.intro.homework.topic5.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SeaBattle {

    public static void main(String[] args) {

        int[][] field1 = fillField1();
        int[][] field2 = fillField1();

        int max = 22;
        int max1 = 0;
        int max2 = 0;


        for (int[] str: field1) {
            System.out.println(Arrays.toString(str));
        }

        System.out.println();

        for (int[] str: field2) {
            System.out.println(Arrays.toString(str));
        }

        Scanner scanner = new Scanner(System.in);
        while (max1 != max || max2 != max) {
            int row1 = scanner.nextInt();
            int column1 = scanner.nextInt();

            if (field1[row1][column1] == 1) {
                max1++;
            }

            int row2 = scanner.nextInt();
            int column2 = scanner.nextInt();

            if (field2[row2][column2] == 1) {
                max2++;
            }
        }

        if (max1 > max2) {
            System.out.println("Победил игрок 2");
        } else {
            System.out.println("Победил игрок 1");
        }

    }

    public static int[][] fillField1() {
        int[][] field = new int[10][10];

        field[0][0] = 1;
        field[0][1] = 1;
        field[0][2] = 1;
        field[0][3] = 1;

        field[2][0] = 1;
        field[2][1] = 1;
        field[2][2] = 1;

        field[3][3] = 1;
        field[3][4] = 1;
        field[3][5] = 1;

        field[4][0] = 1;
        field[4][1] = 1;

        field[5][0] = 1;
        field[5][1] = 1;

        field[5][3] = 1;
        field[5][4] = 1;

        field[5][5] = 1;
        field[5][6] = 1;

        field[9][9] = 1;
        field[9][7] = 1;
        field[9][5] = 1;
        field[9][3] = 1;

        return field;
    }
}
