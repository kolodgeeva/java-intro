package com.kolodzheieva.intro.homework.topic6.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringsMax {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();

        int maxSize = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            strings.add(scanner.next());
            if (strings.get(i).length() > maxSize) {
                maxSize = strings.get(i).length();
            }
        }

        for (String string : strings) {
            if (string.length() == maxSize) {
                System.out.println(string);
            }
        }

    }
}
