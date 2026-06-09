package com.survivalcoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        Cleric cleric = new Cleric("Cleric");

        int CHP, CMP, CMaxHP, CMaxMP;

        cleric.name = "Cleric";
        CHP = cleric.hp;
        CMP = cleric.mp;
        CMaxHP = Cleric.maxHp;
        CMaxMP = Cleric.maxMp;
        System.out.println(cleric.name + " Create");

        cleric.selfAid();
        System.out.println(cleric.name + " MP -5");
        System.out.println("Now MP " + CMP);

        int result = cleric.pray(1);
        System.out.println(result);
        System.out.println("Now MP" + CMP);
    }
}