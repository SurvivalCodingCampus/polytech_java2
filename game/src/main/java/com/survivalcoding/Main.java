package com.survivalcoding;

public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        // Hero hero = new Hero();
        // int a = 10;
        // long l = 10L; // literal

        Cleric cleric = new Cleric("클레릭", 30, 7);

        int mpRecovery = cleric.pray(3);
        System.out.println(mpRecovery);
    }
}