package com.survivalcoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cleric cleric = new Cleric();
        cleric.HP = 50;
        cleric.MP = 10;
        int MAXHP = cleric.maxHP;
        int MAXMP = cleric.maxMP;

        cleric.selfAid();
        System.out.println("used MP " + cleric.MP);

        cleric.pray(1);
        System.out.println("heal " + cleric.MP);
    }
}
