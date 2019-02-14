package com.kolodzheieva.intro.part3;

public class BiggestDigit {

    public static int getTheBiggestDigit(int number) {
        int digit;
        int max = 0;
        while (number > 0) {
            digit = number % 10;
            if (max < digit) {
                max = digit;
            }
            number /= 10;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getTheBiggestDigit(75976678));
    }

}
