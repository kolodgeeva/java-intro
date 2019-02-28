package com.kolodzheieva.intro.strings;

public class CountChars {

    public static void main(String[] args) {

        String employees = "МОЖЖМММММММММММММММММММММММОЖЖМВВВВВВОЖЖМОЖЖМОЖЖМОЖЖМОЖЖМОЖЖМОЖЖММММ";
        int womanCount = 0;
        int manCount = 0;
        int vampireCount = 0;
        int wolfmanCount = 0;

        for (char ch: employees.toCharArray()) {
            switch (ch) {
                case 'Ж':
                    womanCount++;
                    break;
                case 'М':
                    manCount++;
                    break;
                case 'В':
                    vampireCount++;
                    break;
                case 'О':
                    wolfmanCount++;
                    break;
            }
        }

        if (womanCount > manCount && womanCount > vampireCount && womanCount > wolfmanCount) {
            System.out.println("Woman win " + womanCount);
        } else if (manCount > womanCount && manCount > vampireCount && manCount > wolfmanCount) {
            System.out.println("Man win " + manCount);
        } else if (vampireCount > manCount && vampireCount > womanCount && womanCount > wolfmanCount) {
            System.out.println("Vampire win " + vampireCount);
        } else if (wolfmanCount > manCount && wolfmanCount > vampireCount && wolfmanCount > womanCount) {
            System.out.println("Wolfman win " + wolfmanCount);
        } else {
            System.out.println("Nobody win");
        }

    }
}
