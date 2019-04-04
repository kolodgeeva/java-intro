package com.kolodzheieva.intro.homework.topic4.cycles;

public class PrimeNumberImproved {

    public static void main(String[] args) {


        int a = 10;
        int b = 100000;

        if (a % 2 == 0) {
            a++;
        }

       for (int i = a; i <= b; i+=2) {
           if (isPrime(i)) {
               System.out.println(i);
           }
       }
    }

    // нам нужны только нечетные числа
    // и только нечетные делители
    static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 3; i < Math.sqrt(n); i+=2) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
