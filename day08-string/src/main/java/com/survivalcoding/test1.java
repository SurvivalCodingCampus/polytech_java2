package com.survivalcoding;

public class test1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            str.append(String.format("%d,", i));
        }

        String[] a = str.toString().split(",");
    }
}