package com.zolotyh.warmup;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        //fizzBuzz.fizzBuzzPrint(3);
        fizzBuzz.fizzBuzzPrint(15);
        // fizzBuzz.fizzBuzzPrint(8);
    }

    void fizzBuzzPrint(int i){
        // enter your code
        String fizz = "Fizz";
        String buzz = "Buzz";
        if (i % 3 == 0) {
            System.out.print(fizz);
        }
        if (i % 5 == 0) {
            System.out.print(buzz);
        }
        if ((i % 3 != 0) && (i % 5 != 0)) {
            System.out.print(i);
        }
    }
}
