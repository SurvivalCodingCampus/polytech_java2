package com.survivalcoding;

public class Main {
    public static void main(String[] args) {
        Cleric cleric = new Cleric("Arthas");
        Wizard wizard = new Wizard();

        cleric.hp = 50;
        cleric.mp = 10;

        System.out.println(cleric.hp);
    }
}
