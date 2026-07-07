package com.survivalcoding;

public class dustmq07061 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(",");
        }

        String str = sb.toString();
        String[] a = str.split(",");
    }
}
