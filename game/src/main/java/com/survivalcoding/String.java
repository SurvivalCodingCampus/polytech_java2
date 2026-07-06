package com.survivalcoding;

public class String {
    java.lang.String num = "0";

    void string() {

        StringBuilder num = new StringBuilder();

        for (int i = 1; i < 101; i++) {
            num.append(i);
            num.append(",");
        }

        String[] a = num.split("[,]");
        for (String word : a) {
            System.out.println(word + "->");
        }

    }
}
