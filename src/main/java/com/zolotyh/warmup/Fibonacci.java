package com.zolotyh.warmup;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacci(8);
    }

    void printFibonacci(long n){
        if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        }

        long result = 0;
        long n_1 = 1;
        long n_2 = 0;

        for (int i = 2; i <= n; i++) {
            result = n_1 + n_2;
            n_2 = n_1;
            n_1 = result;
        }

        System.out.println(result);
    }
}
