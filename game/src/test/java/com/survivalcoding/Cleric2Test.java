package com.survivalcoding;

import org.junit.jupiter.api.Test;

class Cleric2Test {
    @Test
    void ClericCreation() {
        System.out.println("==========================");
        Cleric2 clericA = new Cleric2("아 ", 50, 5);
        System.out.println("[clericA] \nname: " + clericA.name + "\nHP: " + clericA.Hp + "\nMp " + clericA.Mp);
        System.out.println("==========================");
        Cleric2 clericB = new Cleric2("서 ", 35);
        System.out.println("[clericB] \nname: " + clericB.name + "\nHP: " + clericB.Hp + "\nMp " + clericB.Mp);
        System.out.println("==========================");
        Cleric2 clericC = new Cleric2("스 ");
        System.out.println("[clericC] \nname: " + clericC.name + "\nHP: " + clericC.Hp + "\nMp " + clericC.Mp);
        System.out.println("==========================");
    }
}
