package com.kolodzheieva.intro.homework.topic5.arrays;

public class AverageAgeArray {

    public static void main(String[] args) {
        int[] team1 = {2, 3, 4, 5, 6};
        int[] team2 = {2, 3, 4, 5, 6};

        float averageAge1 = 0;
        float averageAge2 = 0;

        for (int i = 0; i < team1.length; i++) {
            System.out.print(team1[i] + " ");
            averageAge1 += team1[i];
        }

        for (int i = 0; i < team2.length; i++) {
            System.out.print(team2[i] + " ");
            averageAge2 += team2[i];
        }

        averageAge1 /= team1.length;
        averageAge2 /= team2.length;

        System.out.println();
        System.out.println("First team: " + averageAge1);
        System.out.println("Second team: " + averageAge2);

        if (averageAge1 > averageAge2) {
            System.out.println("First team is older");
        } else if (averageAge2 > averageAge1) {
            System.out.println("Second team is older");
        } else {
            System.out.println("Equal");
        }


    }

}
