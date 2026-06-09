package com.survivalcoding;

public class Main {
    public static void main(String[] args) {
        //인스턴스 생성
        Hero hero = new Hero();

        int a = 10;
        long l = 10L; //literal 리터널

        Cleric cleric = new Cleric();

        cleric.name = "cleric";
        cleric.selfAid();
        System.out.println(cleric.MP);

        cleric.MP += cleric.pray(1);
        System.out.println(cleric.MP);

    }
}