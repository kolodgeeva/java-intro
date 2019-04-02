package com.kolodzheieva.intro.homework.topic3.conditions;

public class PeopleAge {

    public static void whoIsOldest(int one, int two, int three) {
        // one
        if (one > two) {
            System.out.println(one + " older than " + two + " by " + (one - two));
        }
        if (one > three) {
            System.out.println(one + " older than " + three + " by " + (one - three));
        }

        // two
        if (two > one) {
            System.out.println(two + " older than " + one + " by " + (two - one));
        }
        if (two > three) {
            System.out.println(two + " older than " + three + " by " + (two - three));
        }

        // three
        if (three > one) {
            System.out.println(three + " older than " + one + " by " + (three - one));
        }
        if (three > two) {
            System.out.println(three + " older than " + two + " by " + (three - two));
        }
    }

    public static void main(String[] args) {
        whoIsOldest(3, 5, 8);
    }
}
