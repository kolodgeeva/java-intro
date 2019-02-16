package com.kolodzheieva.intro.part3;

public class SimpleNumber {

    public static void main(String[] args) {

       for (int i = 20; i <= 100000; i++) {
           if (isSimple(i)) {
               System.out.println(i);
           }
       }
    }

    static boolean isSimple(int n) {
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;

        return true;

    }

}
