package com.zolotyh.warmup;

public class Numbers {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.calculateAndPrint(1350);
    }

    void calculateAndPrint(int n) {
        int hundreds = n / 100;
        System.out.println(hundreds % 2 == 0 ? n + 100 : n * 2);
    }
}
