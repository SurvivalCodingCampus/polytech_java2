package com.survivalcoding;

public class test3 {
    public static void main(String[] args) {
        String[] samples = {"hello", "A5", "A52", "UABC", "A5X"};

        for (String s : samples) {
            System.out.printf("%-10s 1)%b 2)%b 3)%b%n",
                    s,
                    s.matches(".*"),
                    s.matches("A\\d\\d?"),
                    s.matches("U[A-Z]{3}")
            );
        }
    }
}