package com.zolotyh.warmup;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrom("Madam i’m Adam");
    }

    void checkPalindrom(String s){
        String lowerCase = s.toLowerCase();
        StringBuilder onlyLetters = new StringBuilder();
        for (int i = 0; i < lowerCase.length(); i++) {
            if (Character.isLetter(lowerCase.charAt(i)) || Character.isDigit(lowerCase.charAt(i))) {
                onlyLetters.append(lowerCase.charAt(i));
            }
        }
        String onlyLettersString = onlyLetters.toString();
        String result = onlyLettersString.equals(onlyLetters.reverse().toString()) ? "yes" : "no";
        System.out.println(result);
    }
}
